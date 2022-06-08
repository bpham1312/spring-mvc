const $ = document.querySelector.bind(document);
const $$ = document.querySelectorAll.bind(document);

const btnOpen = $$('.ticket-detail .buy');
const navLi = $$('.list-nav li');
const btnClose = $('.modal-box .btn-close');
const modal = $('.js-modal');
const modalBox = $('.js-modal .modal-box');
const btnMenu = $('#header .menu-btn');
const header = $('#header');
const subNav = $('.list-nav .subNav');
const containerSlideImage = $('#slide .container-image');
const slideImage = $$('#slide .slide-image');
const btnPrev = $('.btn-prev');
const btnNext = $('.btn-next');
const slideText= $$('.slide-text');

//open and close menu
btnMenu.addEventListener('click', function () {
    if (header.classList.contains('close-menu')) {
        header.classList.remove('close-menu');
    } else {
        subNav.classList.add('close-subNav');
        header.classList.add('close-menu');
    }
});
btnClose.addEventListener('click', closeModal);
modal.addEventListener('click', closeModal);

// stopPropagation close modal
modalBox.addEventListener('click', function (e) {
    e.stopPropagation();
});

//open modal
for (let btn of btnOpen) {
    btn.addEventListener('click', function () {
        modal.classList.add('open');
    })
}
//close modal
function closeModal() {
    modal.classList.remove('open');
}

// check subNav
for (const items of navLi) {
    // dont close when click more and show subNav
    let checkSubNav = items.childNodes.length;
    items.addEventListener('click', function (e) {
        if (checkSubNav == 1) {
            subNav.classList.add('close-subNav');
            header.classList.add('close-menu');
        } else {
            e.preventDefault();
        }
        let subNavclose = subNav.classList.contains('close-subNav');
        // close subNav if this is second click again
        if (subNavclose && !header.classList.contains('close-menu')) {
            subNav.classList.remove('close-subNav');
        } else if (!subNavclose) {
            subNav.classList.add('close-subNav');
        }
    });
}

//slide
let count = 0;
let imageSize = slideImage[0].offsetWidth;
let offSetLeft = 0;

//auto next slide
setInterval(nextSlide, 4500);

//responsive slide
window.addEventListener('resize', ()=>{
    imageSize = slideImage[0].offsetWidth;
    nextSlide();
});

//btn next slide
btnNext.addEventListener('click', nextSlide);

//btn preverse slide
btnPrev.addEventListener('click', ()=>{
    if(count<=0){
        containerSlideImage.style.transform = 'translateX('+(-lastChild([...slideImage]).offsetLeft)+'px)';
        count = slideImage.length-1;
    }else{
        count--;
        offSetLeft = -imageSize*count;
        containerSlideImage.style.transform = 'translateX('+(offSetLeft)+'px)';
    }
});

//change text when image change
containerSlideImage.addEventListener('transitionend', ()=>{
    $('.slide-text.active').classList.remove('active');
    slideText[count].classList.add('active');
});

//function next slide
function nextSlide(){
    if(count>=(slideImage.length-1)){
        containerSlideImage.style.transform = 'translateX('+(firstChild([...slideImage]).offsetLeft)+'px)';
        count = 0;
    }else{
        count++;
        offSetLeft = -imageSize*count;
        containerSlideImage.style.transform = 'translateX('+(offSetLeft)+'px)';
    }
};

//get last child
function lastChild(lastChild) {
    return lastChild.pop();
};

//get first child
function firstChild(firstChild) {
    return firstChild.shift();
};