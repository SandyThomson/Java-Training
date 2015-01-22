  1. Byte streams are useful for dealing with binary data. Character streams are convenient when dealing with characters (you could convert bytes to characters yourself but it would be a PITA).
  
  2. As Java started off with these as byte streams, meaning this has been retained (it would probably break a lot of existing code if they just changed it?)
  
  3. See OpenFileBytes[Test].java  
  
  4. See OpenFileCharacters[Test].java
  
  5. See OpenFileRandomAcess[Test].java
  
  6. Use something like 
  ```java
  parseDouble(String s);
  ```
  
  7. See FileCopierTraditional.java
  
  8. See FileCopierTryWithResources.java
  
  9. InputStream? (just checked ... yes it is)
  
  10. Returns -1
  
  11. DataInputStream?
  
  12. Reader and Writer are at the top of the character IO class hierarchies (character streams)
  
  13. try with resources is used for automagically closing open resources when finished. It also streamlines your code and makes it a lot more readable.
  
  14. True - if you didn't do this, you'd need to remember to close the file in "good" scenarios, and also exceptional scenarios (there is a risk you won't close it, meaning memory leaks etc.