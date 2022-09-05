# AAEntornosGimnasio

Para esta aplicación he implementado las tres clases, el menu y los tests necesarios para que la aplicación sea válida conforme a los requisitos de la AA.

Es una aplicación de gimnasios que permuta entre gimnasios, entrenadores y clientes.

Se ha creado un repositorio con las ramas de master y develop, configurando también el fichero README. Se ha hecho Pull Request de las ramas de feature.
Se ha configurado un job en Jenkins para la compilación y empaquetado, y también ha sido analizado por SonarQube. Se ha instalado y ejecutado VisualVM.

En las funcionalidades opcionales, se ha configurado maven para poder lanzar un análisis. 
En concreto, maven ha hecho sin problemas las etapas de clean, validate, compile, test, package, verify e install, pero ha fallado en site y deploy.
Se han añadido unos test JUnit. Se ha añadido tambien una release del proyecto.
