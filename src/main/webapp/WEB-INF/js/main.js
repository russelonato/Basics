var pets = [
    {
        "name":"His Majesty", 
        "species": "cat", 
        "favFood": "tuna"
    }, 
    {
        "name":"scratch", 
        "species":"dog", 
        "favFood":"meat"
    }
]

var pageCounter = 0;

var urls = [
    //'https://learnwebcode.github.io/json-example/animals-1.json',
    'localhost:8080/api/v1/ajaxjsonsample/pets',
    'https://learnwebcode.github.io/json-example/animals-2.json',
    'https://learnwebcode.github.io/json-example/animals-3.json'
]

var btn = document.getElementById("btn")

var animalContainer = document.getElementById("animal-info")

function renderHtml (data){
    var htmlString = "";

    data.forEach(element => {
        var name  = element.name;
        var species = element.species;
        var likes = element.foods.likes.join(', ');
        var dislikes = element.foods.dislikes.join(', ');

        htmlString += `<p>The ${species}'s name is ${name} and they love ${likes} but hate ${dislikes}.</p>`;
    });

    animalContainer.insertAdjacentHTML("beforeend", htmlString);
}

var clickEvent = function(){
    var request = new XMLHttpRequest();
    request.open("GET", urls[pageCounter]);
    request.onload = function(){
        var data = JSON.parse(request.responseText);
        renderHtml(data);
    };
    
    request.send();

    if(++pageCounter > 3){
        btn.classList.add("disabled-item");
    }
}

btn.addEventListener("click", clickEvent)

