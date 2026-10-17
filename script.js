const button = document.getElementById("convertButton");

const clearButton = document.getElementById("clearButton");
button.addEventListener("click", convertCurrency);
clearButton.addEventListener("click", clearHistory);
let history = [];
let totalConversions = 0;
let largestConversion = 0;
let totalAmount = 0;

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

    document.getElementById("history").innerHTML = history.join("<br>");
    document.getElementById("totalConversions").textContent= "Total Conversions: " + totalConversions;
    document.getElementById("largestConversion").textContent = "Largest Conversion: " + largestConversion;
    let averageConversion = totalAmount / totalConversions;
    document.getElementById("averageConversion").textContent = "Average Conversion: " + averageConversion.toFixed(2);
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
}
