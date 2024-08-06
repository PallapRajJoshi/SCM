console.log("script loaded");
let currentTheme = getTheme();
//initial


document.addEventListener('DOMContentLoaded',()=>{
    changeTheme();

});





// to change theme 
function changeTheme() {
    //set to web page
    changePageTheme(currentTheme,currentTheme);
    document.querySelector("html").classList.add(currentTheme);
    updateButtonText();
    //set the listener to change theme button
    const changeThemeButton = document.querySelector("#theme_change_button");

    changeThemeButton.addEventListener("click", (event) => {
       let oldTheme = currentTheme;
       
      
        if (currentTheme === "dark") {
            //light theme

            currentTheme = "light";
        } else {
            currentTheme = "dark";
        }
        changePageTheme(currentTheme,oldTheme);
      

    });
}






function changePageTheme(theme,oldTheme){

     //changing localstorage
     setTheme(currentTheme);


     //remove the old theme
     if(oldTheme ){

        document.querySelector("html").classList.remove(oldTheme);
     }
    

     //set the current theme
     document.querySelector("html").classList.add(theme);

     //updating the button text
     updateButtonText();
}


// set theme to localstorage
function setTheme(theme) {
    localStorage.setItem("theme", theme)
}

//get theme from loxal storage
function getTheme() {
    let theme = localStorage.getItem("theme");

    return theme ? theme : "light";
}




function updateButtonText() {


    const changeThemeButton = document.querySelector("#theme_change_button");

    // change the text of button

    changeThemeButton.querySelector("span").textContent = currentTheme == "light" ? "Dark" : "Light";



}

