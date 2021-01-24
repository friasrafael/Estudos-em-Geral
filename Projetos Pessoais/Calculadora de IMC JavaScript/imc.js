function calcular() {
    var altura = document.querySelector('input#txaltura')
    var peso = document.querySelector('input#txpeso')
    var resultado = document.querySelector('div#res')
    var a = Number(altura.value)
    var p = Number(peso.value)
    var imc = p / (a*a)

        if (imc > 0) {
            resultado.innerHTML = (`Resultado: Seu IMC é ${imc.toFixed(2)}.</br>`)
        } else {
        }
        
        if (a == 0 || p == 0) { 
            window.alert('Informe um valor existente.')
            resultado.innerHTML += ('Informe um valor existente.')
        }  else if (imc < 18.5) {
            resultado.innerHTML += ('Você está abaixo do peso ideal.')
        } else if (imc >= 18.5 && imc < 25) {
            resultado.innerHTML += ('Você está no peso ideal. Parabéns!')
        } else if (imc >= 25 && imc < 30) {
            resultado.innerHTML += ('Você está um pocuo acima do peso.')
        } else if (imc >= 30 && imc < 35) {
            resultado.innerHTML += ('Você tem Obesidade Grau I.')
        } else if (imc >= 35 && imc < 40) {
            resultado.innerHTML += ('Você tem Obesidade Grau II.')
        } else if (imc > 40) {
            resultado.innerHTML += ('Você tem Obesidade Grau III.')
        }
}