# Examen fin module Systemes Distribues
 
 ## <span style="color:green "> 1.Project Presentation</span>
 * <strong style="color:dark">On souhaite créer un système distribué basé sur les micro-services en utilisant une architecture pilotée
par les événements respectant les deux patterns Event Sourcing et CQRS. Cette application devrait
permettre de gérer des commandes de produits appartenant à des clients. L’application se compose
des micro-services fonctionnels suivants :

	- Le micro-service « Customer-Service » qui permet de gérer les clients.
	- Le micro-service Inventory-Service qui permet de gérer les produits.
	- Le micro-service « Order-Service » qui permet de gérer des commandes.

## Établir une architecture technique du projet

![image](https://user-images.githubusercontent.com/84138772/209530041-49539ebb-a5b6-41b3-a0b2-b4df8afc9582.png)

## Établir un diagramme de classe global du projet

![image](https://user-images.githubusercontent.com/84138772/209529681-0fa1744b-0f69-4164-90a7-0ff405c9122e.png)

## Déployer le serveur AXON Server

![image](https://user-images.githubusercontent.com/84138772/209530570-c4fc3344-b086-44cc-b93a-be62bef8a652.png)


## Gatway Service

![image](https://user-images.githubusercontent.com/84138772/209532150-13f77c1a-c3cf-4cb5-a683-a19deec829f0.png)

### Config

```
server.port=9999
spring.application.name=GATEWAY-SERVICE
spring.cloud.discovery.enabled=true
eureka.instance.prefer-ip-address=true

```

## Discovery Service

![image](https://user-images.githubusercontent.com/84138772/209532389-f48dca5c-5c80-440e-9c17-e071e2bdeed9.png)

### config 

```
server.port=8761
# dont register server itself as a client.
eureka.client.fetch-registry=false
# Does not register itself in the service registry.
eureka.client.register-with-eureka=false

```

### Web Portal 

![image](https://user-images.githubusercontent.com/84138772/209532496-7ad0df9b-c414-41e4-8cb2-f7d75a7d0d85.png)
