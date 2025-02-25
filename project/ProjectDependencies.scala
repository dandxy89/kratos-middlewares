import sbt.{ ModuleID, compilerPlugin, _ }

object ProjectDependencies extends {

  private[this] object Version {
    val circeVersion     = "0.13.0"
    val http4sVersion    = "0.21.2"
    val JwtVersion       = "4.3.0"
    val scalaTestVersion = "3.1.1"
  }

  def apply(): Seq[ModuleID] = Seq(
    // Project dependencies
    "io.circe"      %% "circe-generic"        % Version.circeVersion,
    "io.circe"      %% "circe-core"           % Version.circeVersion,
    "io.circe"      %% "circe-parser"         % Version.circeVersion,
    "io.circe"      %% "circe-generic-extras" % Version.circeVersion,
    "io.circe"      %% "circe-jawn"           % Version.circeVersion,
    "org.http4s"    %% "http4s-blaze-server"  % Version.http4sVersion,
    "org.http4s"    %% "http4s-blaze-client"  % Version.http4sVersion,
    "org.http4s"    %% "http4s-circe"         % Version.http4sVersion,
    "org.http4s"    %% "http4s-dsl"           % Version.http4sVersion,
    "com.pauldijou" %% "jwt-core"             % Version.JwtVersion,
    "org.scalatest" %% "scalatest"            % Version.scalaTestVersion % "it, test",
    // Compiler Plugins
    compilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full),
    compilerPlugin("com.olegpy"     %% "better-monadic-for" % "0.3.1")
  )
}
