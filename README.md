## SOLID Principles

**SOLID** : est une approche de conception structurée qui garantit que votre logiciel est modulaire et facile à maintenir.

1. **Single Responsibility**
2. **Open/Closed**
3. **Liskov Substitution**
4. **Interface Segregation**
5. **Dependency Inversion**

### **Single Responsibility** : 
Une classe ne doit avoir qu’**une seule responsabilité**. De plus, elle ne devrait avoir **qu’une seule raison de changer**.

### **Open/Closed** : 
Le code doit être **ouvert à l'extension** mais **fermé à la modification**. Supposons que tu souhaites ajouter un nouveau type de produit, tu ne devrais pas modifier les classes existantes.

### **Liskov Substitution** : 
Les sous-classes doivent pouvoir être utilisées **à la place** de leurs classes parentes **sans altérer le comportement** de l'application.
Exemple : `Parent p = new Parent();` peut être remplacé par `Parent p = new Child();`.

### **Interface Segregation** : 
Signifie que les classes ne doivent pas être forcées de dépendre d’**interfaces qu’elles n’utilisent pas**. En d’autres termes, une interface ne doit pas inclure de méthodes non pertinentes pour la classe d’implémentation. Les interfaces doivent être **spécifiques** et centrées sur des comportements particuliers.

### **Dependency Inversion** : 
Le principe de l’inversion des dépendances découple les modules logiciels. Les modules de haut niveau ne dépendent plus des modules de bas niveau. **Les deux dépendent d’abstractions**, favorisant la flexibilité.
