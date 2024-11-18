# design-patterns

# Adapter

        +---------------------------------------+
        |                Client                 | <- Uses Target interface
        |        (e.g., UserService)            |
        +---------------------------------------+
                        |
                        v
        +---------------------------------------+
        |           Target Interface            | <- Defines expected interface
        |          (e.g., User interface)       |
        +---------------------------------------+
                        |
                        v
        +---------------------------------------+
        |                Adapter                | <- Converts Adaptee's methods
        | (e.g., UserAdapter implementing User) |
        +---------------------------------------+
                        |
                        v
        +---------------------------------------+
        |               Adaptee                 | <- Original incompatible class
        |       (e.g., ExternalUser class)      |
        +---------------------------------------+


    Client:
        Interacts only with the Target Interface.
        In this case, it’s the UserService which expects a User.

    Target Interface:
        Defines the methods expected by the Client.
        Example: The User interface with getFullName() and getEmail().

    Adapter:
        Implements the Target Interface and internally uses the Adaptee.
        Translates the method calls from the Client to the corresponding methods of the Adaptee.
        Example: UserAdapter.

    Adaptee:
        The existing or external class with a different interface.
        Example: ExternalUser with getName() and getContactInfo().

# Decorator

        +---------------------------------------+
        |                Client                 | <- Uses decorated objects
        |        (e.g., UserService)            |
        +---------------------------------------+
                        |
                        v
        +---------------------------------------+
        |           Component Interface         | <- Defines the common interface
        |      (e.g., UserComponent interface)  |
        +---------------------------------------+
                        |
                        v
        +---------------------------------------+
        |           Concrete Component          | <- The base object to decorate
        |          (e.g., BasicUser class)      |
        +---------------------------------------+
                        |
                        v
        +---------------------------------------+
        |             Base Decorator            | <- Adds basic structure for decoration
        |       (e.g., UserDecorator class)     |
        +---------------------------------------+
                        |
                        v
        +---------------------------------------+
        |          Concrete Decorators          | <- Adds specific functionality
        | (e.g., PremiumUserDecorator class,    |
        |       AdminUserDecorator class)       |
        +---------------------------------------+


    Component Interface (User):
        Defines the structure that decorators and the base component must implement.

    Concrete Component (BasicUser):
        Provides the default behavior of a User.

    Base Decorator (UserDecorator):
        Delegates the functionality to the wrapped object while allowing subclasses to add new behavior.

    Concrete Decorators (LoggingUserDecorator, EncryptedUserDecorator):
        Add specific behaviors (logging, encryption) to the User.

    Client:
        Dynamically combines decorators to extend functionality without modifying the existing code.
