<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
</head>
<body>

<h1>Ajouter un enseignant</h1>
<form method="get" action="AddEnseignant">
  <div class="form-group">
  <label >Nom</label>
    <input type="text" class="form-control" name="nom"  placeholder="Nom">
  </div>
   <label >Prenom</label>
    <input type="text" class="form-control" name="prenom"  placeholder="Prenom">
  </div>
   <label >CNSS</label>
    <input type="text" class="form-control" name="cnss"  placeholder="CNSS">
  </div>
   <label >CNPRS</label>
    <input type="text" class="form-control" name="cnprs"  placeholder="CNPRS">
  </div>
   <label >Nombre d'Enfants</label>
    <input type="text" class="form-control" name="nbEnfants"  placeholder="Nombre d'Enfants">
  </div>
   <label >Diplome</label>
    <input type="text" class="form-control" name="diplome"  placeholder="Diplome">
  </div>
  <div class="form-group">
  <label >rib IBAN</label>
    <input type="text" class="form-control" name="rib_IBAN"  placeholder="rib IBAN">
  </div>
  <div class="form-group">
  <label >Image</label>
    <input type="text" class="form-control" name="img"  placeholder="Image">
  </div>
  <div class="form-group">
  <label >Poste</label>
    <input type="text" class="form-control" name="poste"  placeholder="Poste">
  </div>
  <div class="form-group">
  <label >Etablissement d'origine</label>
    <input type="text" class="form-control" name="etablissementOrigine"  placeholder="Etablissement d'origine">
  </div>

  <button type="submit" class="btn btn-primary">Ajouter</button>
</form>
</body>
</html>