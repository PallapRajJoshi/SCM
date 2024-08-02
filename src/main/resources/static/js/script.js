console.log("script loaded");
let currentTheme = getTheme();


//initial
changeTheme(currentTheme);
// to change theme 
function changeTheme() {
    //set to web page
    document.querySelector("html").classList.add(currentTheme);


    updateButtonText();
    //set the listener to change theme button
    const changeThemeButton = document.querySelector("#theme_change_button");
    changeThemeButton.addEventListener("click", (event) => {
        console.log("changed button clicked");
        const oldTheme = currentTheme;
        if (currentTheme === "dark") {
            //light theme

            currentTheme = "light";
        } else {
            currentTheme = "dark";
        }
        //changing localstorage
        setTheme(currentTheme);


        //remove the old theme
        document.querySelector("html").classList.remove(oldTheme);

        //set the current theme
        document.querySelector("html").classList.add(currentTheme);

        //updating the button text
        updateButtonText();

    });
}




function updateButtonText() {


    const changeThemeButton = document.querySelector("#theme_change_button");

    // change the text of button

    changeThemeButton.querySelector("span").textContent = currentTheme == "light" ? "Dark" : "Light";



}

// set theme to localstorage
function setTheme(theme) {
    localStorage.setItem("theme", theme)
}

//get theme from loxal storage
function getTheme() {
    let theme = localStorage.getItem("theme");
    // if (theme) {
    //     return theme;
    // } else {
    //     return "light";
    // }

    return theme ? theme : "light";
}