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

	
	
## Customer Service
	
![image](https://user-images.githubusercontent.com/84138772/209543638-0e644c4a-bae9-4801-9214-42e18307619a.png)

### CUSTOMER COMMAND SERVICE

![image](https://user-images.githubusercontent.com/84138772/209543715-50eaacfe-f623-4521-974e-f4be4e851291.png)

#### Config 
	
	```
	server.port=8181
	spring.application.name=CUSTOMER-COMMAND-SERVICE
	spring.cloud.discovery.enabled=true
	eureka.instance.prefer-ip-address=true
	
	```
	
### CUSTOMER-QUERY-SERVICE	
	
![image](https://user-images.githubusercontent.com/84138772/209544022-b107ddac-14d9-4fe3-9f24-ef1ffbbc1544.png)

	```
	server.port=8883
	spring.datasource.url=jdbc:h2:mem:radar-db
	spring.h2.console.enabled=true
	spring.application.name=CUSTOMER-QUERY-SERVICE
	spring.cloud.discovery.enabled=true
	eureka.instance.prefer-ip-address=true

	#axon
	axoniq.axonserver.keep-alive-time=0
	axoniq.axonserver.keep-alive-timeout=604800000
	axoniq.axonserver.min-keep-alive-time=604800000
	
	```
	
	
![image](https://user-images.githubusercontent.com/84138772/209542495-65ca831f-842d-4ee8-933e-38d1c8af0978.png)
	
	
## Test 
	
![image](https://user-images.githubusercontent.com/84138772/209544330-6735b8b2-e633-47f3-a023-4e79994c37c5.png)

	
	

	
	
	
	
	
	
	
	
