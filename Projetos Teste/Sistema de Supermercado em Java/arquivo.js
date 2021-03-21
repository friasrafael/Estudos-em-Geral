let n = 0

function armazenar() {
         
    let item = document.querySelector("input#txItem")
    let quantidade = document.querySelector("input#txQuantidade")
    let list = document.querySelector("div#lista")
    let luc = document.querySelector("div#lucro")
    let i = Number(item.value)
    let q = Number(quantidade.value)
    let v = 0
    let lucro = 0
   
     if (i > 0 && i <= 4) {

    switch (i) {
        case 1:
            v = 3
            lucro = q * v
            list.innerHTML += (`Laranja R$${lucro} </br>`)
        break;
        case 2:
            v = 7
            lucro = q * v
            list.innerHTML += (`Coca Cola R$${lucro} </br>`)
        break;
        case 3:
            v = 4
            lucro = q * v
            list.innerHTML += (`Leite R$${lucro} </br>`)
        break;
        case 4:
            v = 1.10
            lucro = q * v
            list.innerHTML += (`Média R$${lucro} </br>`)
        break;
        default:
            alert("Código Inválido, digite um código existente.")
    }   
 
        n += lucro
        luc.innerHTML = (`Valor total das compras: R$${n}`)    
            
    } else {
        alert("Código Inválido, digite um código existente.")
    }
}