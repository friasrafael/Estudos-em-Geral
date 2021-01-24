function salvar() {
    let nomes = document.querySelector("input#nome");
    let nome = String(nomes.value)
    let sobreNomes = document.getElementById('sobreNome');
    let sobreNome = String(sobreNomes.value)
    let idades = document.getElementById('idade');
    let idade = parseInt(idades.value)
    let pesos = document.getElementById('peso');
    let peso = parseFloat(pesos.value)
    let alturas = document.getElementById('altura');
    let altura = parseFloat(alturas.value)
    let resultados = document.getElementById('res');
   
    

    resultados.innerHTML = `${nome} </br>${sobreNome} </br>${idade} </br>${peso} </br>${altura}`;
}


