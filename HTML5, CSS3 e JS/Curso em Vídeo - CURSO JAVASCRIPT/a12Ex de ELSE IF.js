var id = 64
console.log(`Sua idade é ${id}.`)
if (id < 16) {
    console.log('Não Vota!')
} else if (id < 18 || id >= 65) {
    console.log('Voto Opcional!')
} else {
    console.log('Voto Obrigatório!')
}