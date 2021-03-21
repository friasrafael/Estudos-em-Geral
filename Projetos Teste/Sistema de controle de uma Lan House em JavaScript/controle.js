


function mostra() {

    var login1 = document.getElementById('txlogin');
    var senha1 = document.getElementById('txsenha');

    var login = Number(login1.value);
    var senha = Number(senha1.value);

    if (login == 0001 && senha == 12345) {

        if (document.getElementById('ma').style.display == 'none') {
            document.getElementById('ma').style.display = 'block';
        } else {
            document.getElementById('ma').style.display = 'none';
        }

    } else {
        alert("Senha inválida. Tente novamente!")
    }
}
//Máquina 1:
var h1 = document.getElementById('txh1')
var m1 = document.getElementById('txm1')
var s1 = document.getElementById('txs1')

var hh1 = Number(h1.value);
var mm1 = Number(m1.value);
var ss1 = Number(s1.value);

var tempo1 = 1000;//Valocidade do tempo em milésimos de segundo
var cron1;
//Inicia o temporizador
function start1() {
    hh1 = Number(h1.value);
    mm1 = Number(m1.value);
    ss1 = Number(s1.value);

    cron1 = setInterval(() => { timer1(); }, tempo1);
    document.getElementById("run").disabled = true;

}
//Para o temporizador mas não limpa as variáveis
function pause1() {
    clearInterval(cron1)
    document.getElementById("run").disabled = false;
}
//Para o temporizador e limpa as variáveis
function stop1() {
    clearInterval(cron1);
    hh1 = 0;
    mm1 = 0;
    ss1 = 0;

    document.getElementById('counter1').innerText = '00:00:00';
    document.getElementById("run").disabled = false;
}

function continue1() {
    cron1 = setInterval(() => { timer1(); }, tempo1);
}

//Faz a contagem do tempo e exibição
function timer1() {

    if (hh1 != 0 && mm1 == 0 && ss1 == 0) {
        hh1--;
        mm1 = 59;
        ss1 = 59;
    }

    if (ss1 != 0) {
        ss1--;
    }
    if (ss1 == 0) { //Verifica se deu 0 segundos
        ss1 = 59; //Volta os segundos para 59
        mm1--; //Adiciona -1 na variável mm

        if (mm1 == 0) { //Verifica se deu 0 minutos
            mm1 = 59;//Volta os minutos para 59
            hh1--;//Adiciona -1 na variável hora
        }
    }
    if (hh1 == -1 || mm1 == -1 || ss1 == -1) {
        //Cria uma variável com o em String "Acabou o tempo" caso HH, MM ou SS sejam igual a -1

        var format1 = '00:00:00';
    } else {
        //Edita  a variável format com o valor tratado HH:MM:SS
        format1 = (hh1 < 10 ? "0" + hh1 : hh1) + ":" + (mm1 < 10 ? "0" + mm1 : mm1) + ":" + (ss1
            < 10 ? "0" + ss1 : ss1);
    }
    //Insere o valor tratado no elemento counter
    document.getElementById('counter1').innerHTML = format1;
    //Retorna o valor tratado
    return format1;
}
//Máquina 2:
var h2 = document.getElementById('txh2')
var m2 = document.getElementById('txm2')
var s2 = document.getElementById('txs2')

var hh2 = Number(h2.value);
var mm2 = Number(m2.value);
var ss2 = Number(s2.value);

var tempo2 = 1000;//Valocidade do tempo em milésimos de segundo
var cron2;
//Inicia o temporizador
function start2() {
    hh2 = Number(h2.value);
    mm2 = Number(m2.value);
    ss2 = Number(s2.value);

    cron2 = setInterval(() => { timer2(); }, tempo2);
    document.getElementById("run").disabled = true;
}

function continue2() {
    cron2 = setInterval(() => { timer2(); }, tempo2);
}
//Para o temporizador mas não limpa as variáveis
function pause2() {
    clearInterval(cron2)
    document.getElementById("run").disabled = false;
}
//Para o temporizador e limpa as variáveis
function stop2() {
    clearInterval(cron2);
    hh2 = 0;
    mm2 = 0;
    ss2 = 0;

    document.getElementById('counter2').innerText = '00:00:00';
    document.getElementById("run").disabled = false;
}

//Faz a contagem do tempo e exibição
function timer2() {

    if (hh2 != 0 && mm2 == 0 && ss2 == 0) {
        hh2--;
        mm2 = 59;
        ss2 = 59;
    }

    if (ss2 != 0) {
        ss2--;
    }
    if (ss2 == 0) { //Verifica se deu 0 segundos
        ss2 = 59; //Volta os segundos para 59
        mm2--; //Adiciona -1 na variável mm

        if (mm2 == 0) { //Verifica se deu 0 minutos
            mm2 = 59;//Volta os minutos para 59
            hh2--;//Adiciona -1 na variável hora
        }
    }
    if (hh2 == -1 || mm2 == -1 || ss2 == -1) {
        //Cria uma variável com o em String "Acabou o tempo" caso HH, MM ou SS sejam igual a -1

        var format2 = '00:00:00';
    } else {
        //Edita  a variável format com o valor tratado HH:MM:SS
        format2 = (hh2 < 10 ? "0" + hh2 : hh2) + ":" + (mm2 < 10 ? "0" + mm2 : mm2) + ":" + (ss2
            < 10 ? "0" + ss2 : ss2);
    }
    //Insere o valor tratado no elemento counter
    document.getElementById('counter2').innerHTML = format2;
    //Retorna o valor tratado
    return format2;
}
//Máquina 3:
var h3 = document.getElementById('txh3')
var m3 = document.getElementById('txm3')
var s3 = document.getElementById('txs3')

var hh3 = Number(h3.value);
var mm3 = Number(m3.value);
var ss3 = Number(s3.value);

var tempo3 = 1000;//Valocidade do tempo em milésimos de segundo
var cron3;
//Inicia o temporizador
function start3() {
    hh3 = Number(h3.value);
    mm3 = Number(m3.value);
    ss3 = Number(s3.value);

    cron3 = setInterval(() => { timer3(); }, tempo3);
    document.getElementById("run").disabled = true;
}

function continue3() {
    cron3 = setInterval(() => { timer3(); }, tempo3);
}
//Para o temporizador mas não limpa as variáveis
function pause3() {
    clearInterval(cron3)
    document.getElementById("run").disabled = false;
}
//Para o temporizador e limpa as variáveis
function stop3() {
    clearInterval(cron3);
    hh3 = 0;
    mm3 = 0;
    ss3 = 0;

    document.getElementById('counter3').innerText = '00:00:00';
    document.getElementById("run").disabled = false;
}

//Faz a contagem do tempo e exibição
function timer3() {

    if (hh3 != 0 && mm3 == 0 && ss3 == 0) {
        hh3--;
        mm3 = 59;
        ss3 = 59;
    }

    if (ss3 != 0) {
        ss3--;
    }
    if (ss3 == 0) { //Verifica se deu 0 segundos
        ss3 = 59; //Volta os segundos para 59
        mm3--; //Adiciona -1 na variável mm

        if (mm3 == 0) { //Verifica se deu 0 minutos
            mm3 = 59;//Volta os minutos para 59
            hh3--;//Adiciona -1 na variável hora
        }
    }
    if (hh3 == -1 || mm3 == -1 || ss3 == -1) {
        //Cria uma variável com o em String "Acabou o tempo" caso HH, MM ou SS sejam igual a -1

        var format3 = '00:00:00';
    } else {
        //Edita  a variável format com o valor tratado HH:MM:SS
        format3 = (hh3 < 10 ? "0" + hh3 : hh3) + ":" + (mm3 < 10 ? "0" + mm3 : mm3) + ":" + (ss3
            < 10 ? "0" + ss3 : ss3);
    }
    //Insere o valor tratado no elemento counter
    document.getElementById('counter3').innerHTML = format3;
    //Retorna o valor tratado
    return format3;
}

//Máquina 4:
var h4 = document.getElementById('txh4')
var m4 = document.getElementById('txm4')
var s4 = document.getElementById('txs4')

var hh4 = Number(h4.value);
var mm4 = Number(m4.value);
var ss4 = Number(s4.value);

var tempo4 = 1000;//Valocidade do tempo em milésimos de segundo
var cron4;
//Inicia o temporizador
function start4() {
    hh4 = Number(h4.value);
    mm4 = Number(m4.value);
    ss4 = Number(s4.value);

    cron4 = setInterval(() => { timer4(); }, tempo4);
    document.getElementById("run").disabled = true;
}

function continue4() {
    cron4 = setInterval(() => { timer4(); }, tempo4);
}

//Para o temporizador mas não limpa as variáveis
function pause4() {
    clearInterval(cron4)
    document.getElementById("run").disabled = false;
}
//Para o temporizador e limpa as variáveis
function stop4() {
    clearInterval(cron4);
    hh4 = 0;
    mm4 = 0;
    ss4 = 0;

    document.getElementById('counter4').innerText = '00:00:00';
    document.getElementById("run").disabled = false;
}

//Faz a contagem do tempo e exibição
function timer4() {

    if (hh4 != 0 && mm4 == 0 && ss4 == 0) {
        hh4--;
        mm4 = 59;
        ss4 = 59;
    }

    if (ss4 != 0) {
        ss4--;
    }
    if (ss4 == 0) { //Verifica se deu 0 segundos
        ss4 = 59; //Volta os segundos para 59
        mm4--; //Adiciona -1 na variável mm

        if (mm4 == 0) { //Verifica se deu 0 minutos
            mm4 = 59;//Volta os minutos para 59
            hh4--;//Adiciona -1 na variável hora
        }


    }
    if (hh4 == -1 || mm4 == -1 || ss4 == -1) {
        //Cria uma variável com o em String "Acabou o tempo" caso HH, MM ou SS sejam igual a -1

        var format4 = '00:00:00';
    } else {
        //Edita  a variável format com o valor tratado HH:MM:SS
        format4 = (hh4 < 10 ? "0" + hh4 : hh4) + ":" + (mm4 < 10 ? "0" + mm4 : mm4) + ":" + (ss4
            < 10 ? "0" + ss4 : ss4);
    }
    //Insere o valor tratado no elemento counter
    document.getElementById('counter4').innerHTML = format4;
    //Retorna o valor tratado
    return format4;
}



