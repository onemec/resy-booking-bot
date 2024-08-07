name := "resy-booking-bot"

scalaVersion := "2.13.14"

ThisBuild / scalafixDependencies ++= Seq(
  "com.github.vovapolu" %% "scaluzzi"         % "0.1.23",
  "org.scalatest"       %% "autofix"          % "3.1.0.1",
  "com.eed3si9n.fix"    %% "scalafix-noinfer" % "0.1.0-M1"
)

val root = Project("resy-booking-bot", file("."))
  .settings(
    semanticdbEnabled := false,
    scalacOptions += "-Ywarn-unused",
    libraryDependencies ++= Seq(
      "org.playframework"        %% "play-ahc-ws"     % "3.0.5",
      "com.github.pureconfig"    %% "pureconfig"      % "0.17.7",
      "org.apache.logging.log4j" %% "log4j-api-scala" % "13.1.0",
      "org.apache.logging.log4j"  % "log4j-core"      % "2.23.1" % Runtime,
      "org.scalatest"            %% "scalatest"       % "3.2.19" % Test,
      "org.mockito"               % "mockito-core"    % "5.12.0"  % Test,
      "org.slf4j"                 % "slf4j-nop"       % "2.0.13"
      // The above removes failed to load class warning
    ),
    publish := {},
    publishLocal := {}
  )
