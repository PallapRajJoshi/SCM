console.log("script loaded");
let currentTheme = getTheme();
//initial
changeTheme();
// to change theme 
function changeTheme() {
    //set to web page
    changePageTheme(currentTheme,currentTheme);
    document.querySelector("html").classList.add(currentTheme);
    updateButtonText();
    //set the listener to change theme button
    const changeThemeButton = document.querySelector("#theme_change_button");
    const oldTheme = currentTheme;
    changeThemeButton.addEventListener("click", (event) => {
        console.log("changed button clicked");
      
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
     document.querySelector("html").classList.remove(oldTheme);

     //set the current theme
     document.querySelector("html").classList.add(currentTheme);

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

