<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<center>
    <title>Loan management</title>
</center>
    <style>
        /* Style the tabs */
        .tab {
            display: none;
        }
	 
	
	
    </style>
</head>
<body>
    <h1>Tabbed Interface</h1>
    
    <div id="tabs">
        <button class="tablink" onclick="openTab(event, 'customerTab')">Customer Registration</button>
        <button class="tablink" onclick="openTab(event, 'loanApplicationTab')">Loan Application</button>
        <button class="tablink" onclick="openTab(event, 'loanNomineeTab')">Loan Nominee</button>
    </div>

    <div id="customerTab" class="tab">
        <!-- Include the content of your "Customer Registration" JSP page here -->
	
    <h2>Customer Registration Form</h2>
    <form action="Customerdetails" method="get">
        <label for="cust_fname">First Name:</label>
        <input type="text" id="cust_fname" name="cust_fname" required><br><br>

        <label for="cust_lname">Last Name:</label>
        <input type="text" id="cust_lname" name="cust_lname" required><br><br>

        <label for="cust_dob">Date of Birth:</label>
        <input type="text" id="cust_dob" name="cust_dob" required><br><br>

        <label for="cust_panno">PAN Number:</label>
        <input type="text" id="cust_panno" name="cust_panno" maxlength="10" required><br><br>

        <label for="cust_mobile">Mobile Number:</label>
        <input type="text" id="cust_mobile" name="cust_mobile" pattern="\d{10}" required><br><br>

        <label for="cust_address">Address:</label>
        <textarea id="cust_address" name="cust_address" rows="4" cols="50" required></textarea><br><br>

        <label for="cust_gname">Guardian Name:</label>
        <input type="text" id="cust_gname" name="cust_gname" required><br><br>

        <input type="submit" value="Save">
    </form>
   

       
    </div>

    <div id="loanApplicationTab" class="tab">
        <!-- Include the content of your "Loan Application" JSP page here -->



    <h2>Loan Application Form</h2>
    <form action="LoanApplicants" method="get">
        
        <label for="la_date">Application Date:</label>
        <input type="text" id="la_date" name="la_date" required><br><br>

        <label for="la_lnty_id">Loan Type :</label>
       <select id="select"><option value="1">personal loan</option></select><br><br>

        <label for="la_amount">Loan Amount:</label>
        <input type="text" id="la_amount" name="la_amount" required><br><br>

        <label for="la_emirange_from">EMI Range (From):</label>
        <input type="text" id="la_emirange_from" name="la_emirange_from" required><br><br>

        <label for="la_emirange_to">EMI Range (To):</label>
        <input type="text" id="la_emirange_to" name="la_emirange_to" required><br><br>

        <label for="la_nom_req">No Of Months Required:</label>
        <input type="text" id="la_nom_req" name="la_nom_req" required><br><br>

        <label for="la_cibil_score">CIBIL Score:</label>
        <input type="text" id="la_cibil_score" name="la_cibil_score" required><br><br>

        <label for="la_status">Status:</label>
        <input type="text" id="la_status" name="la_status" required><br><br>

        <label for="la_conclusion_remarks">Conclusion Remarks:</label>
        <textarea id="la_conclusion_remarks" name="la_conclusion_remarks" rows="4" cols="50" required></textarea><br><br>

        <input type="submit" value="Save">
    </form>


      
    </div>

    <div id="loanNomineeTab" class="tab">
        

    <h2>Loan Nominee Information</h2>
    <form action="Loannom" method="get">
        <label for="ln_nominee">Nominee Name:</label>
        <input type="text" id="ln_nominee" name="ln_nominee" required><br><br>

        <label for="ln_relation">Relation:</label>
        <input type="text" id="ln_relation" name="ln_relation" required><br><br>

        <input type="submit" value="Save">
    </form>
    <form action="preview" method="get">
    <input type="submit" value="Submit">
    </form>

    </div>

    <script>
        // Function to open a tab
        function openTab(evt, tabName) {
            var i, tabcontent, tablinks;
            tabcontent = document.getElementsByClassName("tab");
            for (i = 0; i < tabcontent.length; i++) {
                tabcontent[i].style.display = "none";
            }
            tablinks = document.getElementsByClassName("tablink");
            for (i = 0; i < tablinks.length; i++) {
                tablinks[i].className = tablinks[i].className.replace(" active", "");
            }
            document.getElementById(tabName).style.display = "block";
            evt.currentTarget.className += " active";
        }
		
	 function saveData(data, variableName) {
            window[variableName] = data;
        }

        // Function to load data from JavaScript variables when switching tabs
        function loadData() {
            document.getElementById("customerData").value = window.customerData || '';
            document.getElementById("loanApplicationData").value = window.loanApplicationData || '';
            document.getElementById("loanNomineeData").value = window.loanNomineeData || '';
        }

        // Load data when the page loads
        loadData();
    </script>
</body>
</html>
