const q = document.querySelector.bind(document);
const qq = document.querySelectorAll.bind(document);

const btnNew = q('.form-input .btn-new');
console.log(btnNew);
btnNew.addEventListener('click', ()=>{
    const inPutFade = q('.input');
    const inPut = q('.new');
    if(btnNew.innerText === 'New'){
        inPutFade.classList.remove('JS-fade');
        inPut.classList.add('JS-fade');
        btnNew.innerText = 'Cancel';
    }else{
		inPut.value='';
        inPutFade.classList.add('JS-fade');
        inPut.classList.remove('JS-fade');
        btnNew.innerText = 'New';
    }
})