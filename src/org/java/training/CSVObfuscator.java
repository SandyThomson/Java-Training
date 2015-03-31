package org.java.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CSVObfuscator {
	private Map<String, Function<String,String>> headerTransforms = new HashMap<>();
	private Map<String, Function<String,String>> fieldTransforms = new HashMap<>();
	private List<String> headings = new ArrayList<>();
	private boolean initialised = false;
	private final String delim;

	public CSVObfuscator(String delimeter) {
		this.delim = delimeter;
	}
	
	public CSVObfuscator headerTransform(String header, Function<String, String> transform) {
		headerTransforms.put(header, transform);
		return this;
	}
	
	public CSVObfuscator transform(String field, Function<String, String> transform) {
		fieldTransforms.put(field, transform);
		return this;
	}
	
	public String obfuscateLine(String line) {
		if ( !initialised && (initialised = true) )
			return parseHeader(line);
		return processLine(line);
	}
	
	public String parseHeader(String header) {
		return Arrays.stream(header.split("\\" + delim))
			.map(this::pushHeader)
			.map(this::transformHeader)
			.filter(h -> h != null)
			.collect(Collectors.joining(delim));
	}
	
	public String processLine(String line) {
		Iterator<String> iter = headings.iterator();
		
		return Arrays.stream(line.split("\\" + delim)).map(s -> {
			String label;
			if( iter.hasNext() && fieldTransforms.containsKey((label = iter.next())) )
				return fieldTransforms.get(label).apply(s);
			return s;			
		}).filter(s -> s != null).collect(Collectors.joining(delim));
	}
	
	public String pushHeader(String heading) {
		headings.add(heading);
		return heading;
	}
	
	public String transformHeader(String header) {
		if(headerTransforms.containsKey(header))
			return headerTransforms.get(header).apply(header);
		return header;
	}
}