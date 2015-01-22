import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;



public class SpacesToHyphensTest {

	@Test
	public void testConvert() throws IOException {
		String expected = "Lorem-ipsum-dolor-sit-amet,-consectetur-adipiscing-elit.-Nulla-vestibulum-est-vel-risus-lacinia,-vel-suscipit-ligula-consequat.-Donec-molestie-rhoncus-orci-non-molestie.-Aliquam-tellus-nibh,-porttitor-sed-erat-ac,-blandit-vulputate-mauris.-Pellentesque-eros-risus,-malesuada-sit-amet-dolor-nec,-aliquam-congue-nisl.-Curabitur-condimentum-lectus-elit,-nec-tempor-odio-laoreet-ac.-Aliquam-lacinia-rhoncus-mattis.-Cras-nisi-mi,-fringilla-non-felis-id,-finibus-fringilla-erat.-Integer-lacus-massa,-bibendum-eget-sodales-ornare,-lobortis-sit-amet-tellus.-Morbi-id-dolor-sodales,-sollicitudin-enim-non,-consectetur-felis.-Donec-molestie,-augue-accumsan-aliquet-finibus,-eros-massa-posuere-lacus,-quis-feugiat-est-ligula-sed-lectus.-In-et-justo-vestibulum,-pretium-dui-ac,-ullamcorper-dui.-Vestibulum-felis-justo,-placerat-ac-rutrum-sed,-vestibulum-nec-augue.-Quisque-tempor-vestibulum-est-ut-consectetur.-Ut-condimentum-arcu-ac-libero-pharetra-blandit.-Integer-ipsum-ligula,-luctus-quis-lobortis-eu,-pellentesque-quis-arcu.-Vestibulum-in-mauris-libero.Sed-quis-mauris-vitae-nulla-feugiat-tristique-id-id-ligula.-Fusce-dictum-tortor-nec-efficitur-pharetra.-Vestibulum-vitae-sem-non-justo-feugiat-sodales-nec-eu-lectus.-Fusce-id-tellus-a-tellus-rutrum-pharetra.-Praesent-sodales-pulvinar-lorem,-vitae-sodales-enim-luctus-cursus.-Aliquam-lorem-eros,-vestibulum-vitae-ultricies-ac,-vulputate-sed-tortor.-Cras-molestie-nulla-augue,-in-rutrum-tortor-commodo-vitae.-Aliquam-fermentum-luctus-velit-vel-ultrices.-Proin-vitae-leo-accumsan,-tempor-est-ac,-porttitor-ex.-Lorem-ipsum-dolor-sit-amet,-consectetur-adipiscing-elit.-Vivamus-non-lectus-ullamcorper-ipsum-laoreet-efficitur-ut-at-nulla.-Phasellus-mollis,-leo-et-fermentum-dignissim,-mauris-lorem-tempus-elit,-lobortis-varius-ante-velit-vel-quam.";

		SpacesToHyphens sth = new SpacesToHyphens( "resources/blarg", "resources/ouput" );
		sth.convert();
		
		BufferedReader br = new BufferedReader( new FileReader( "resources/output" ) );
		
		String actual = "";
		
		do {
			actual += br.readLine();
		}
		while ( br.readLine() != null );

		br.close();

		assertEquals( expected, actual );
	}

}
