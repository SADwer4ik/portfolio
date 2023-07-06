function toggleMenu(){
   var menuToggle = document.querySelector('.menuToggle');
   var navigation = document.querySelector('.navigation');
   menuToggle.classList.toggle('active');
   navigation.classList.toggle('active');
}
function toggleDay(){
   var icon = document.getElementById('icon');
   icon.onclick = function(){
      document.body.classList.toggle('dark-theme');
   };
   if(document.body.classList.contains('dark-theme')){
      icon.src = '/images/sunny-outline.svg';
   } else{
      icon.src = '/images/moon-outline.svg';
   }
   
}