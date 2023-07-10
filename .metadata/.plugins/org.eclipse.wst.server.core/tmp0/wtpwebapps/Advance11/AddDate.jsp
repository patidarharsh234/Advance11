<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date</title>
</head>
<body>
	<form action="AddDateCtl" method="post">
		<table>
			<tr>
				<th align="left">Dob<span style="color: red"></span></th>
				<td><input type="date" name="dob"></td>
			</tr>
			<tr>
				<td align="left" colspan="2"><input type="submit"
					name="operation" value="Add"></td>
			</tr>
		</table>
	</form>

</body>
</html>