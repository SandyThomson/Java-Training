### Chapter 17 Self Test

  1) _What is the top-level package name of the JavaFX framework?_

`javafx`.

  2) _Two concepts central to JavaFX are a stage and a scene. What classes
      encapsulate them?_

`Stage` and `Scene` respectively.

  3) _A scene graph is composed of ______.

`Node`s.

  4) _The base class for all nodes is _____.

`Node`.

  5) _What class will all JavaFX applications extend?_

`Application`.

  6) _What are the three JavaFX life-cycle methods?_

`init`, `start` and `stop`.

  7) _In what life-cycle method can you construct an application's stage?_

`start`.

  8) _The `launch()` method is called to start a free-standing JavaFX application.
      True or False?_

True.

  9) _What are the names of the JavaFX classes that support a label and a button?_

`Label`, `Button`.

 10) _One way to terminate a free-standing JavaFX application is to call `Platform.exit()`.
      `Platform` is packaged in `javafx.Application`. When called, `exit()`
      immediately terminates the program. With this in mind, change the `JavaFXEventDemo`
      program shown in this chapter so that it has two buttons called Run and Exit. If
      Run is pressed, have the program display that choice in a label. If Exit is pressed,
      have the application terminate. Use lambda expressions for the event handlers._

See [Terminator.java](src/org/java/training/Terminator.java).

 11) _What JavaFX control implements a check box?_

`CheckBox`.

 12) _`ListView` is a control that displays a directory list of files on the local file system.
      True or False?_

False, unless you were to populate it with directory contents.

 13) _Convert the Swing-based file comparison program in **Try This 16-1** so it uses JavaFX
      instead. In the process, make use of another of JavaFX's features: its ability to fire
      an action event on a button under program control. This is done by calling `fire()` on
      the button instance. For example, assuming a `Button` called `myButton`, the following
      will fire an action event on it: `myButton.fire()`. Use this fact when implementing the
      event handlers for the text fields that hold the names of the files to compare. If the user
      presses ENTER when in either of these fields, simply fire an action event on the Compare
      button. The event-handling code for the Compare button will then handle the fire comparison._

See [FileComparison.java](src/org/java/training/FileComparison.java).

 14) _Modify the `EffectsAndTransformDemo` program so the Rotate button is also blurred. Use a
      blur width and height of 5 and an iteration count of 2._

See [BlurryRotator.java](src/org/java/training/BlurryRotator.java).

 15) _On your own, experiment with other effects and transforms. For example, try the `Glow` effect
      and the `Translate` transform._

See [EffectsDemo.java](src/org/java/training/EffectsDemo.java).

 16) _Continue to advance in your knowledge of Java. A good way to start is by examining Java's core
      packages, such as `java.lang`, `java.util`, and `java.net`. Write sample programs
      that demonstrate their various classes and interfaces. In general, the best way to become a
      great Java programmer is to write lots of code._

It is done (/I'll just move onto some Rust instead).