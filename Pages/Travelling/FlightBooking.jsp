<%@include file="../Common/Global.jsp"%>
<SCRIPT>
function doEnable()
{
if(document.mainform.type.value=="RT")
{
document.mainform.ddd.disabled = false;
document.mainform.dmm.disabled = false;
document.mainform.dyy.disabled = false;
}
else
{
document.mainform.ddd.disabled = true;
document.mainform.dmm.disabled = true;
document.mainform.dyy.disabled = true;
}
}
function doSubmit()
{
var strErrMsg;
strErrMsg = "";			
strErrMsg = doValidations();
if (strErrMsg == "" )
{				
document.mainform.action = "<%=path+"/flightbooking"%>";				
document.mainform.submit();
}
else
{alert(strErrMsg);}
}
function doValidations()
{
var ddIndex;
var strTemp;
var strFld;
var frmDoc;
var strErrMsg;
strErrMsg = "";
frmDoc = document.mainform;			
strFld = frmDoc.source
strTemp = frmDoc.destination
if (strFld.value == strTemp.value) strErrMsg = strErrMsg + " Source and destination cant be same\n";
strFld = frmDoc.not
if (strFld.value == "" ) strErrMsg = strErrMsg + " Nuber of tickets is incorrect\n";
strFld = frmDoc.type
if (strFld.value == "RT") 
{	
if(frmDoc.syy.value<=frmDoc.dyy.value)
{
if(frmDoc.smm.value<=frmDoc.dmm.value)
{
if(frmDoc.sdd.value>frmDoc.ddd.value)
strErrMsg = strErrMsg + " Date is Incorrect\n";
}
else
strErrMsg = strErrMsg + " Date is Incorrect\n";
}
else
strErrMsg = strErrMsg + " Date is Incorrect\n";
}
strFld = frmDoc.cardno
if (strFld.value == "" || strFld.value.length<4) 		
strErrMsg = strErrMsg + " Credit Crad No. is Invalid\n";
return strErrMsg;
}
</SCRIPT>
<TABLE WIDTH=580 align=center cellspacing=0 cellpadding=0 style="font:bold 11px verdana">
<TR><Td align=center><BR>Search&nbsp;:&nbsp;<input type=text name=search class=input>&nbsp;&nbsp;<button accesskey='S'><u>S</u>earch</button>&nbsp;&nbsp;<a href='advanced.htm'>Advanced Search</a><BR><BR></Th></TR>
<TR><Th style='color:green'><BR><B><center>Travel Management</center></B><BR></TD></TR></TABLE>
<table cellspacing=0 cellpadding=4><FORM name=mainform method=post action="<%=path+"/login"%>"
	<%
		String status=request.getAttribute("Response")!=null?"<TR><TD colspan=2 align=center style='color:maroon'>"+request.getAttribute("Response").toString()+"</TD></TR>":"";
		out.println(status);
	%>
<TR>
	<TD align=right>Customer Id&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
			<TD><input name="loginid" type="text" class=input value="<%=user%>">
		</TR>
		<TR>
			<td align=right>Departure From&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
			<td> <select name="source" id="source">
<option value="ND" selected>New Delhi</option>
<option value="KL">Kolkata</option>
<option value="CH">Chennai</option>
<option value="MB">Mumbai</option>
<option value="BG">Banglore</option>
<option value="ID">Indore</option>
<option value="LK">Lucknow</option>
<option value="RC">Ranchi</option>
</select></TD></TR>
		<TR>
			<td align=right>Arrival To&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
			<td><select name="destination" id="destination">
<option value="ND">New Delhi</option>
<option value="KL">Kolkata</option>
<option value="CH" selected>Chennai</option>
<option value="MB">Mumbai</option>
<option value="BG">Banglore</option>
<option value="ID">Indore</option>
<option value="LK">Lucknow</option>
<option value="RC">Ranchi</option>
</select></TD>
		</TR>
		<tr><td align=right>Departure Date&nbsp;&nbsp;:&nbsp;&nbsp;</td>
		<td><select name="sdd" id="sdd">
<option value="1">01</option>
<option value="2">02</option>
<option value="3">03</option>
<option value="4">04</option>
<option value="5">05</option>
<option value="6">06</option>
<option value="7">07</option>
<option value="8">08</option>
<option value="9">09</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13" selected>13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>
</select><select name="smm" id="smm">
<option value="1">JAN</option>
<option value="2">FEB</option>
<option value="3">MAR</option>
<option value="4">APR</option>
<option value="5">MAY</option>
<option value="6">JUN</option>
<option value="7">JUL</option>
<option value="8">AUG</option>
<option value="9">SEP</option>
<option value="10">OCT</option>
<option value="11" selected>NOV</option>
<option value="12">DEC</option>
</select> 
<select name="syy" id="syy">
<option value="04" selected>2004</option>
<option value="05">2005</option>
<option value="06">2006</option>
<option value="07">2007</option>
<option value="08">2008</option>
<option value="09">2009</option>
</select></td>
		</tr>
		<TR>
			<TD align=right>No.of Tickets&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
			<TD><input name="not" type="text" class=input></TD></TR>
	<TR>
			<TD align=right>Class&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
			<TD><select name="class" id="class">
<option value="EC" selected>Economy</option>
<option value="BS">Business</option>
<option value="FS">First</option>
</select> </tD>
	</TR>
	<TR>
		<TD align=right>Type&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
			<TD><select name="type" id="type" onChange="javascript:doEnable();">
<option value="RT">Round Trip</option>
<option value="OW" selected>One Way</option>
</select> </TD>
		</TR>
	<TR>
		<TD align=right>Return Date&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
			<TD><select name="ddd" id="select" disabled=true>
<option value="1">01</option>
<option value="2">02</option>
<option value="3">03</option>
<option value="4">04</option>
<option value="5">05</option>
<option value="6">06</option>
<option value="7">07</option>
<option value="8">08</option>
<option value="9">09</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21" selected>21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>
</select> <select name="dmm" id="select2" disabled=true>
<option value="01">JAN</option>
<option value="02">FEB</option>
<option value="03">MAR</option>
<option value="04">APR</option>
<option value="05">MAY</option>
<option value="06">JUN</option>
<option value="07">JUL</option>
<option value="08">AUG</option>
<option value="09">SEP</option>
<option value="10">OCT</option>
<option value="11" selected>NOV</option>
<option value="12">DEC</option>
</select> <select name="dyy" id="select3" disabled=true>
<option value="04" selected>2004</option>
<option value="05">2005</option>
<option value="06">2006</option>
<option value="07">2007</option>
<option value="08">2008</option>
<option value="09">2009</option>
</select></TD>
		</TR>

	<TR>
		<TD align=right>Enter last four digits of your Credit Card No&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
			<TD><input name="cardno" type="text" class=input>
		</TR>

<TR><Td colspan=2 align=center><button onclick="javascript:doSubmit()">Book Flight</button>
</TD></TR></tABLE></form>
<!--<SCRIPT>setFooter("<%=path%>","<%=path+"/Images/Flightbg.jpg"%>")</SCRIPT>-->


