const $ = document.querySelector.bind(document);
const $$ = document.querySelectorAll.bind(document);

const nav = $$('.nav>li');
const subNav = $$('.nav .sub-nav');
const a = $$('.nav a');



for (item of nav) {
    const subNav = item.lastElementChild;
    item.addEventListener('click', () => {
        subNav.classList.toggle('JS-sub-nav-fade-out');
    })
}

for (item of subNav) {
    item.addEventListener('click', (e) => {
        e.stopPropagation();
    })
}

for (item of a) {
    const li = item.lastElementChild;
    item.addEventListener('click', () => {
		const aActive=$('.JS-sub-nav-a-active');
        if(aActive){
            aActive.classList.remove('JS-sub-nav-a-active');
        }
        li.classList.add('JS-sub-nav-a-active');
    })
}

