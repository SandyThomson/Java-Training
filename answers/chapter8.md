
  1. TODO
  
  2. A namespace is essentially a way of partitioning Java programs for access control and to avoid naming conflicts / collisions. 
  This is managed by the package keyword, and classes in a package are kept in a directory structure with the same heirarchy.
  
  3. Packages are stored in file system directories.
  
  4. protected is less restrictive than default, as it allows all subclasses to access a member, even if the subclass isn't in the same package.
  
  5. If a member is public, it can be used directly by any class. If a member is protected, it can be used by any class that _extends_ the class containing the member.
  
  6. Erm, the feature of defining an interface, and then implementing it many times. Is this a trick question?
  
  7. In theory, no limit to either. However in reality, a class can't implement more than 65535 interfaces (soure: SO)
  
  8. Interfaces can be extended by other interfaces
  
  9. TODO
  
  10. Yes. They are constants, and have global access.
  
  11. A package is a container for classes. It can also contain interfaces etc.
  
  12. java.lang
  
  13. default
  
  14. It is possible to define a static method in an interface from Java 8 onwards. 
  This method can be accessed without a direct implementation of the interface, using something like ```java Interface.method();```
  
  15. TODO
  
  16. See my answer to Q14.