# Apache Maven Starter

### ⚙️ The project uses:

- Java SE 15 (for distributing a portable code for desktops and servers)
- PostgreSQL database
- Apache Tomcat (web server and servlet container)
- Jakarta Servlet (to process requests to the web server via the client-server protocol HTTP/S)
- Java Server Pages (to create dynamic web pages)
- JSTL (JSP spec extension for conditional processing, looping, page internationalization, parsing XML data)
- JUnit 4 framework (to perform unit, integration and acceptance tests)

ℹ️ The project showing all aspects of working with the Apache Maven project build system:

- Dependency management
- Dependency scope
- Resolving transitive dependencies conflicts
- All project lifecycle phases
- War and jar type packaging
- Binding plugin goal to phase
- Multi modules project
- Build Profiles
- Properties and Resource Filtering
- Plugin Management:
- Surefire to run unit tests
- Failsafe to run integration tests
- Jacoco to generate documentation of passed tests and their source code coverage
- Release to create release versions of projects and push them to a remote repository (github)
- Assembly to package your application into archives (jar)
- Dependency to download all dependencies (including transitive ones) into separate directories (this is what many other Java applications do, such as Apache Tomcat, Apache Maven, Gradle, etc.)
- Creating your own plugin
- Deploying an artifact to a remote Nexus repository