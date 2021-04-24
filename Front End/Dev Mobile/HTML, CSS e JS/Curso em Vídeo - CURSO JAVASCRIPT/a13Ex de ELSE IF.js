var hatual = new Date()
var h = hatual.getHours()
console.log(`Agora são exatamente ${h} horas.`)
if (h >= 1 && h <= 6){
    console.log('Boa Madrugada!')
} else if (h > 6 && h < 12) {
    console.log('Bom Dia!')
} else if (h <= 18) {
    console.log('Boa Tarde!')
}  else if (h > 18 && h <= 24){
    console.log('Boa Noite!')
} else {
    console.log('Digite uma hora válida.')
}
