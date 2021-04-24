function meuEscopo() {
    const form = document.querySelector(".form"); //const form recebe o valor do formulário
    const res = document.querySelector('.resultado');

    function recebeForm(evento) { //criar função que recebe o formulário
        evento.preventDefault();

        const nome = form.querySelector('.nome');
        const sobreNome = form.querySelector('.sobreNome');
        const idade = form.querySelector('.idade');
        const peso = form.querySelector('.peso');
        const altura = form.querySelector('.altura');

        res.innerHTML = `${nome}`;
        console.log(nome.value , sobreNome.value , idade.value , peso.value , altura.value);
    }
    form.addEventListener('submit', recebeForm); //executa o evento submit e a função "recebeForm"
}
meuEscopo(); //executa a função "meuEscopo()"