/* Para utilizar o JQUERY basta utilizar $ > ( ) > e dentro dos parênteses adicionar o ID ou CLASS do elemento que receberá alterações.
No exemplo abaixo o H1 vai sumir após dois segundos respondendo ao comando .fadeOut() e aparecerá após dois segundos respondendo ao comando .fadeIn()  */
$('h1').fadeOut(200).fadeIn(200)

/* Essa tag vai acrescenter uma palavra ou frase ao final do texto. */
$('h1').append('!!!')

/* Para selecionar um ID basta utilizar # e o nome do ID. Ex.: #button. Para utilizar selecionar uma CLASS utilize .class 
$('#button').remove() , por exemplo, fará o botão com ID button sumir da tela */
$('button').on('click', blau) //Fazendo o comando onClick com JQUERY
$('button').on('click', botao) //Fazendo o mesmo botão chamar duas FUNCTIONS ao mesmo tempo

//Utilizando JQUERY dentro de uma função que será acionada depois de um evento de mouse de click em um botão
function botao() {
    $('li').fadeOut(2000).fadeIn(2000)
}

//Utilizando JQUERY para fazer alterações no CSS
function blau() {
    $('li').css({'color':'blue'})
}