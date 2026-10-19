const button = document.getElementById("convertButton");

const clearButton = document.getElementById("clearButton");
const exportButton = document.getElementById("exportButton");
button.addEventListener("click", convertCurrency);
clearButton.addEventListener("click", clearHistory);
exportButton.addEventListener("click", exportHistory);
let history = JSON.parse(localStorage.getItem("history")) || [];
let totalConversions = Number(localStorage.getItem("totalConversions")) || 0;
let largestConversion = Number(localStorage.getItem("largestConversion")) || 0;
let totalAmount = Number(localStorage.getItem("totalAmount")) || 0;
let smallestConversion = Number(localStorage.getItem("smallestConversion")) || Infinity;
let theme = localStorage.getItem("theme");
if(theme === "dark")
{
    darkMode();
}
else if(theme === "light")
{
    lightMode();
}
else if(theme === "ultra")
{
    ultraMode();
}
document.getElementById("history").innerHTML = history.join("<br>");
document.getElementById("totalConversions").textContent = "Total Conversions: " + totalConversions;
document.getElementById("largestConversion").textContent = "Largest Conversion: " + largestConversion;
document.getElementById("smallestConversion").textContent = "Smallest Conversion: " + smallestConversion;


const darkModeButton = document.getElementById("darkModeButton");
const lightModeButton = document.getElementById("lightModeButton");
const ultraModeButton = document.getElementById("ultraModeButton");
darkModeButton.addEventListener("click", darkMode);
lightModeButton.addEventListener("click", lightMode);
ultraModeButton.addEventListener("click", ultraMode);

function exportHistory()
{
    let averageConversion = 0;

    if(totalConversions > 0)
    {
        averageConversion = totalAmount / totalConversions;
    }
    let historyText = "Currency Converter Report\n\n" + 
    "Conversion History\n" + "==================\n" + history.join("\n") + "\n\nStatistics\n" + "=========="
    + "\nTotal Conversions: " + totalConversions + "\nLargest Conversion: " + largestConversion + "\nSmallest Conversion: " + smallestConversion
    + "\nAverage Conversion: " + averageConversion.toFixed(2);
    let blob = new Blob([historyText], {type: "text/plain"});
    let link = document.createElement("a");
    link.href = URL.createObjectURL(blob);
    link.download = "currency-history.txt";
    link.click();
    history.join()
}

function darkMode()
{
    const buttons = document.querySelectorAll("button");
    document.body.style.animation = "none";
    document.querySelector("main").style.animation = "none";
    document.body.style.background = "black";
    document.body.style.color = "white";
    document.querySelector("main").style.backgroundColor = "rgb(76,15,98)";
    localStorage.setItem("theme", "dark");
    document.getElementById("header").style.animation = "none";
    buttons.forEach(button => {button.style.animation = "none"});
    document.getElementById("history").style.animation = "none";
}
function lightMode()
{
    const buttons = document.querySelectorAll("button");
    document.body.style.animation = "none";
    document.querySelector("main").style.animation = "none";
    document.body.style.background = "white";
    document.body.style.color = "black";
    document.querySelector("main").style.backgroundColor = "rgb(76,15,98)";
    localStorage.setItem("theme", "light");
    document.getElementById("header").style.animation = "none";
    buttons.forEach(button => {button.style.animation = "none"});
    document.getElementById("history").style.animation = "none";
}
function ultraMode()
{
    document.body.style.animation = "rainbow 3s infinite";
    document.querySelector("main").style.animation = "rainbow 2s infinite";
    localStorage.setItem("theme", "ultra");
    document.getElementById("header").style.animation = "textRainbow 2s infinite";
    const buttons = document.querySelectorAll("button");
    buttons.forEach(button => {button.style.animation = "glow 1s infinite"});
    document.querySelector("main").style.animation = "rainbow 2s infinite, pulse 2s infinite";
    document.getElementById("history").style.animation = "textRainbow 1.5s infinite";
    document.getElementById("result").textContent = "ULTRA MODE ACTIVATED🔥";
}
if(totalConversions > 0)
{
    let averageConversion = totalAmount / totalConversions;
    document.getElementById("averageConversion").textContent = "Average Conversion: " + averageConversion.toFixed(2);
}

function convertCurrency()
{

    let amount = Number(document.getElementById("amount").value);

        if(amount <= 0 || isNaN(amount))
    {
        document.getElementById("result").textContent = "Please enter a valid amount. ";
        return;
    }
    
    let from = document.getElementById("fromCurrency").value;
    let to = document.getElementById("toCurrency").value;

    let result = 0;
    if(from === to)
    {
        result = amount;
    }

    // USD Conversions
    else if(from === "USD" && to === "EUR")
    {
        result = amount * 0.89;
    }
    else if(from === "USD" && to === "GBP")
    {
        result = amount * 0.76;
    }
    else if(from === "USD" && to === "JPY")
    {
        result = amount * 158.33;
    }
    else if(from === "USD" && to === "AUD")
    {
        result = amount * 1.47;
    }
    else if(from === "USD" && to === "CAD")
    {
        result = amount  * 1.43;
    }

    // EUR Conversions
    else if(from === "EUR" && to === "USD")
    {
        result = amount * 1.12;
    }
    else if(from === "EUR" && to === "GBP")
    {
        result = amount * 0.85;
    }
    else if(from === "EUR" && to === "JPY")
    {
        result = amount * 177.90;
    }
    else if (from === "EUR" && to === "AUD")
    {
        result = amount * 1.61;
    }
    else if(from === "EUR" && to === "CAD")
    {
        result = amount * 1.60;
    }

    // GBP Conversions
    else if(from === "GBP" && to === "USD")
    {
        result = amount * 1.32;
    }
    else if(from === "GBP" && to === "EUR")
    {
        result = amount * 1.17;
    }
    else if(from === "GBP" && to === "JPY")
    {
        result = amount * 208.33;
    }
    else if(from === "GBP" && to === "AUD")
    {
        result = amount * 1.88;
    }
    else if(from === "GBP" && to === "CAD")
    {
        result = amount * 1.88;
    }

    // JPY conversion
    else if(from === "JPY" && to === "USD")
    {
        result = amount * 0.0063;
    }
    else if(from === "JPY" && to === "EUR")
    {
        result = amount * 0.0056;
    }
    else if(from === "JPY" && to === "GBP")
    {
        result = amount * 0.0048;
    }
    else if(from === "JPY" && to === "AUD")
    {
        result = amount * 0.0090;
    }
    else if(from === "JPY" && to === "CAD")
    {
        result = amount * 0.0089;
    }

    // AUD conversion
    else if(from === "AUD" && to === "USD")
    {
        result = amount * 0.70;
    }
    else if(from === "AUD" && to === "EUR")
    {
        result = amount * 0.62;
    }
    else if(from === "AUD" && to === "GBP")
    {
        result = amount * 0.53;
    }
    else if(from === "AUD" && to === "JPY")
    {
        result = amount * 110.72;
    }
    else if(from === "AUD" && to === "CAD")
    {
        result = amount * 0.95;
    }

    // CAD Conversion 
    else if(from === "CAD" && to === "USD")
    {
        result = amount * 0.70;
    }
    else if(from === "CAD" && to === "EUR")
    {
        result = amount * 0.62;
    }
    else if(from === "CAD" && to === "GBP")
    {
        result = amount * 0.53;
    }
    else if(from === "CAD" && to === "JPY")
    {
        result = amount * 110.72;
    }
    else if(from === "CAD" && to === "AUD")
    {
        result = amount * 1.05;
    }

    document.getElementById("result").textContent = "Converted Amount: " + result.toFixed(2) + " " + to;
    history.push(amount + " " + from + " -> " + result.toFixed(2) + " " + to);
    totalConversions++;
    totalAmount = totalAmount + amount;

    if(amount > largestConversion)
    {
        largestConversion = amount;
    }
    if(amount < smallestConversion)
    {
        smallestConversion = amount;
    }

    document.getElementById("history").innerHTML = history.join("<br>");
    document.getElementById("totalConversions").textContent= "Total Conversions: " + totalConversions;
    document.getElementById("largestConversion").textContent = "Largest Conversion: " + largestConversion;
    let averageConversion = totalAmount / totalConversions;
    document.getElementById("averageConversion").textContent = "Average Conversion: " + averageConversion.toFixed(2);
    localStorage.setItem("history", JSON.stringify(history));
    localStorage.setItem("totalConversions", totalConversions);
    localStorage.setItem("largestConversion", largestConversion);
    localStorage.setItem("totalAmount", totalAmount);
    localStorage.setItem("smallestConversion", smallestConversion);


    

    
}

function clearHistory()
{
    history = [];
    totalConversions = 0;
    document.getElementById("history").innerHTML = "";
    document.getElementById("totalConversions").textContent = "Total Conversions: 0";
    document.getElementById("result").textContent = "";
    totalAmount = 0;
    document.getElementById("averageConversion").textContent = "Average Conversion: 0";
    largestConversion = 0;
    document.getElementById("largestConversion").textContent = "Largest Conversion: 0";
    smallestConversion = Infinity;
    document.getElementById("smallestConversion").textContent = "Smallest Conversion: 0";

    localStorage.removeItem("history");
    localStorage.removeItem("totalConversions");
    localStorage.removeItem("largestConversion");
    localStorage.removeItem("totalAmount");
    localStorage.removeItem("smallestConversion");
}
