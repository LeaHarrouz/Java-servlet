# Java-servlet
Implémentation et déploiement d'une Servlet Java sur le Web Server Apache Tomcat

1- Telechargement et installation du serveur web apache tomcat version 9 puisque j'avais le jdk1.8.

2- Dans le file Tomcat->webapps j'ai cree un nouveau folder appelé myApp qui est le nom de mon servlet.Puis dans myApp aussi un autre folder "WEB-INF" ou est localisé tous les files necessaires; Myservlet. java ou se trouve le code qui affichera "Bonjour Lea Harrouz" ainsi que Myservlet.class qui est lui meme cree apres la compilation enfin web.xml qui fera le mapping entre l'URL choisit(maservlet) et la class servlet compilé.(Myservlet)

3- Finallement, dans tomcat nous faisons un startup apres avoir fixer le system environment variables pour pouvoir faire acces a servlet-api pour les requetes html.

4- Dans notre browser nous navigons vers localhost:8080/myApp/maservlet pour voir l'affichage voulu.

voici quelques print-screens:

![image](https://user-images.githubusercontent.com/91898869/152507023-387a39b5-e740-4bd8-81f4-2cb5812a0690.png)
![image](https://user-images.githubusercontent.com/91898869/152507079-ee789c60-2fbc-413e-bc8e-a8cf9b67ce7b.png)
