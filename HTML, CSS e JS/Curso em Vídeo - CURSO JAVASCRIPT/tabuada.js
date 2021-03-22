function calcular() {
    var nn1 = document.querySelector('input#txn1')
    var nn2 = document.querySelector('input#txn2')
    var res = document.querySelector('div#resul')
    var n1 = Number(nn1.value)
    var n2 = Number(nn2.value)
    resultado = n1*n2
    res.innerHTML = (`Resultado: ${resultado}`)
}