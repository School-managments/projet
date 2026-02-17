classDiagram

class Utilisateur {
  Long id
  String username
  String password
  Role role
}

class Eleve {
  Long id
  String nom
  String prenom
  Date dateNaissance
}

class Classe {
  Long id
  String nom
  String niveau
}

class Enseignant {
  Long id
  String nom
  String specialite
}

class Matiere {
  Long id
  String nom
}

class Note {
  Long id
  Double valeur
}

class Bulletin {
  Long id
  Double moyenneGenerale
}

Utilisateur "1" --> "0..*" Eleve : gère
Classe "1" --> "0..*" Eleve : contient
Enseignant "1" --> "0..*" Matiere : enseigne
Eleve "1" --> "0..*" Note : reçoit
Matiere "1" --> "0..*" Note : évalue
Eleve "1" --> "1" Bulletin : possède
