<p align="center"><img src="/doc/logo-api.png"></p>

<h1 align="center">Jurassic Rest API</h1>

<h3 align="center">
 API REST de código aberto para dados de pesquisa e referência organizacional de informações gerenciáveis</h3>

<p align="center">
<a href="https://www.travis-ci.com/github/Mario23junior/Jurassic-API/pull_requests"><img src="https://img.shields.io/github/workflow/status/r-spacex/SpaceX-API/Test?style=flat-square"></a>
<a href="https://en.wikipedia.org/wiki/Representational_state_transfer"><img src="https://img.shields.io/badge/interface-REST-brightgreen.svg?longCache=true&style=flat-square"></a>
</p>

## Etapas para testar ou reproduzir

Primeiro execute o maven 
 
```
 mvn package
```
Em seguida faça
```
java -jar target/jurassic-1.0-SNAPSHOT.jar

```
## Uso

```
  http://localhost:8080/v1/api/data/list
```

## Informações

```
[
   {
      "id":1,
      "caracteristicas":[
         {
            "habitat":"florestas",
            "alimento":"herbívoro",
            "definicao":"O Braquiossauro cujo nome significa 'lagarto braço', dado os seus membros anteriores serem maiores que os posteriores, era um género de dinossauros saurópode que viveu durante o fim do período Jurássico. Este animal tinha entre 18 e 20 metros de altura e cerca de 25 metros de comprimento",
            "curiosidade":"Um braquiossauro podia medir mais de 23 metros de comprimento e pesar mais de 80 toneladas. De altura, ou seja, de sua cabeça até o chão, ele tinha cerca de 12 metros. As características mais marcantes desse dinossauro eram as costas em declive e o pescoço longo."
         }
      ],
      "classificacaoCientificas":[
         {
            "nomeCientifico":"Brachiosaurus",
            "reino":"Animalia",
            "familia":"Brachiosauridae",
            "subordem":"Sauropodomorpha"
         }
      ],
      "nome":"Braquiossauro",
      "urlImage":"https://images2.imgbox.com/8a/ec/zTglGhLJ_o.jpg",
      "comprimento":30,
      "peso":50,
      "altura":25
   }
]
```
