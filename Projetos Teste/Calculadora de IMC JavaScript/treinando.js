function update() {
    var select = document.getElementById('objetivo');
    var option = select.options[select.selectedIndex];

    
    document.getElementById('value').value = option.value;
}
update();
