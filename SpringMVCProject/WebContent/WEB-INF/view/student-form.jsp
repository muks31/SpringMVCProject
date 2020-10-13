<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />

		<br></br>
	
	Last Name: <form:input path="lastName" />

		<br></br>
		
	Country: <form:select path="country">
		<form:options items="${theCountryOptions}"/>
		
		<%-- <form:options items="${student.countryOptions}" /> --%>
		
			<%-- <form:option value="Brazil" label="Brazil" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
			<form:option value="India" label="India" /> --%>


		</form:select>

		<br></br>
		
		Favorite Language:
		<!-- We can use same approach as country option to take values from either Java class or properties file -->
		<form:radiobuttons path="favoriteLanguage" items="${theFavoriteLanguage}"/>
		
		<%-- <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLang}"/> --%>
		
			<%-- Java <form:radiobutton path="favoriteLanguage" value="Java"/>
			C# <form:radiobutton path="favoriteLanguage" value="C#"/>
			JavaScript <form:radiobutton path="favoriteLanguage" value="JavaScript"/>
			Pyhton <form:radiobutton path="favoriteLanguage" value="Python"/> --%>
		<br></br>
		
		Operating System:
		<!-- We can use same approach as country option to take values from either Java class or properties file -->
		
			<form:checkboxes items="${operatingSystems}" path="operatingSystem"/>
		
			<%-- <form:checkboxes items="${student.operatingSystemFromCode}" path="operatingSystem"/> --%>		
	
	
			<%-- MacOS <form:checkbox path="operatingSystem" value ="MacOS"/>
			Windows <form:checkbox path="operatingSystem" value ="Windows"/>
			Linux <form:checkbox path="operatingSystem" value ="Linux"/> --%>
		
		<br></br>

		<input type="submit" value="Submit" />

	</form:form>



</body>

</html>