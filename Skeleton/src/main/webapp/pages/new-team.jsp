<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<c:import url="template/header.jsp" />

<script>
$(document).ready(function(){
  $(".btn").click(function(){      
   var timestamp = new Date();
   $("#timeStampTeamCreation").val(timestamp);
  });
});
</script>


<h1>Specify your team here!</h1>


<form:form method="post" modelAttribute="saveTeamNameForm" action="saveTeam" id="saveTeamNameForm" cssClass="form-horizontal"  autocomplete="off" onsubmit="setTimestamp()">
    <fieldset>
        <legend>Enter Your Team Name</legend>
        <label class="control-label" for="field-teamName">Team Name</label>
        <div class="controls">
            <form:input path="teamName" id="field-teamName" tabindex="1" maxlength="35" placeholder="Team Name"/>
        </div>
        <div class="controls">
            <form:hidden path="timeStampTeamCreation" id="timeStampTeamCreation" tabindex="2"/>
            <p>
                  <a  href="/Skeleton/">User erfassen</a>
            </p>
        </div>
        <div class="form-actions">
            <button type="submit" class="btn btn-primary">Save Team Name</button>
            <button type="button" class="btn">Cancel</button>
        </div>
    </fieldset>
</form:form>



<c:import url="template/footer.jsp" />
