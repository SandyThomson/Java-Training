1. ``Throwable``

2. Some code is placed within the ``try`` block. If it breaks with an exception, this can be handled
in the following ``catch`` block.

3. There is a ``catch`` without a preceding ``try``.

4. Exceptions that aren't caught within a class are handled by the JVM, which reports the exception
to the console.

5. As ``B`` is a subclass of ``A``, it will be caught by the first ``catch`` block. The second, ``B``-specific
catch block will never be executed.

6. Yes.

7. False, the ``finally`` block is executed after a ``try``-``catch`` block, whether or not an exception occurs.

8. Any exception other than a run time exception must be included in the ``throws`` clause of a method
declaration.

9. ``MyClass`` doesn't extend ``Throwable``.

10. See ``Stack.java``

11. An exception can be thrown by the JVM, by coding errors and manually with a ``throw`` statement.

12. Exception and Error

13. Multi-catch allows a ``catch`` block to catch more than one type of exception and handle it
using the same code.

14. Error exceptions don't normally need to be handled within programs as they usually occur due to
situations that can be controlled within the program.