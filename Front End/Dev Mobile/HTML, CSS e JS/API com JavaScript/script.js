const baseUrl = 'https://pokeapi.co/api/v2/pokemon/';

function getElement(element) {
    return document.querySelector(element)
}

const searchInput = getElement('.search-input')
      searchButton = getElement('.search-button')
      container = getElement('.pokemon')
      erroMessage = getElement('.error')

var pokeName, // Nome ou numero passado na caixa de busca
    pokemon, // Responsavel por guardar os dados recebidos da API
    card; // Responsavel por receber o HTML

fetch('https://pokeapi.co/api/v2/pokemon/pikachu')
.then(response => response.json())
.then(data => console.log(data))
.catch(err => console.log(err))

