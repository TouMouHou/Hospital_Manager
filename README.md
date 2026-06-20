# Hospital Manager

A comprehensive hospital management system built in Java that enables efficient management of patients, doctors, and hospital blocks (departments). This application uses the **MVC (Model-View-Controller)** architecture pattern and implements the **Observer pattern** for real-time system updates.

## ✨ Features

- **Patient Management**
  - Add, retrieve, and remove patients
  - Search patients by ID, first name, and last name
  - Queue-based patient management system
  - Track patient history and medical events

- **Doctor Management**
  - Register and manage doctors
  - Assign doctors to hospital blocks
  - Track doctor availability and assignments
  - Remove doctors from the system

- **Hospital Block (Department) Management**
  - Create and manage hospital blocks/departments
  - Assign doctors to blocks
  - Handle block-specific operations
  - Dynamic block allocation

- **History & Tracking**
  - Automatic history recording of all operations
  - Track patient admissions and medical procedures
  - View complete audit trail of system changes
  - State-based history management with snapshots

- **Observer Pattern**
  - Real-time notifications of system changes
  - Automatic history updates on patient changes
  - Block updates on doctor assignments

## 🏗️ Architecture

This project follows the **Model-View-Controller (MVC)** design pattern:

### Model Layer (`src/Model/`)
- **GlobalModel**: Central data manager storing patients, doctors, blocks, and history

### View Layer (`src/View/`)
- **GlobalView**: Main CLI interface for user interaction
- **PatientView**: Patient-specific operations display
- **DoctorView**: Doctor management interface
- **BlockView**: Hospital block management interface
- **HistoryView**: Operation history display

### Controller Layer (`src/Controller/`)
- **PatientController**: Handles patient operations and notifications
- **DoctorController**: Manages doctor-related operations
- **Hospital**: Manages hospital blocks and assignments
- **HistoryController**: Tracks and logs all system changes

### Data Structures (`src/DataStructs/`)
- **Patient**: Patient entity with personal and medical information
- **Doctor**: Doctor entity with specialization and assignment data
- **Block**: Hospital department/block representation
- **Person**: Base class for Patient and Doctor
- **PatientQueue**: FIFO queue for patient management
- **HistoryData**: Records historical state changes
- **Subject/IObserver**: Observer pattern implementation

## 🛠️ Technologies & Tools

- **Language**: Java
- **IDE**: IntelliJ IDEA (compatible with other Java IDEs)
- **Build Method**: Standard Java compilation
- **Design Patterns**: 
  - MVC (Model-View-Controller)
  - Observer Pattern
  - Queue Data Structure

## 📁 Project Structure

```
Hospital_Manager/
├── src/
│   ├── Main.java                 # Application entry point
│   ├── Controller/
│   │   ├── Hospital.java
│   │   ├── DoctorController.java
│   │   ├── PatientController.java
│   │   └── HistoryController.java
│   ├── Model/
│   │   └── GlobalModel.java
│   ├── View/
│   │   ├── GlobalView.java
│   │   ├── PatientView.java
│   │   ├── DoctorView.java
│   │   ├── BlockView.java
│   │   └── HistoryView.java
│   └── DataStructs/
│       ├── Patient.java
│       ├── Doctor.java
│       ├── Person.java
│       ├── Block.java
│       ├── PatientQueue.java
│       ├── Subject.java
│       ├── IObserver.java
│       ├── HistoryData.java
│       └── HistoryStates.java
└── out/                          # Compiled classes (generated)
```

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line/terminal access
- IntelliJ IDEA (optional, but recommended)

### Compilation

**Using IntelliJ IDEA:**
1. Open the project folder in IntelliJ IDEA
2. The IDE will automatically detect the Java project structure
3. Navigate to **Build** → **Build Project** (or press `Ctrl+F9`)

**Using Command Line:**
```bash
cd Hospital_Manager
javac -d out src/**/*.java
```

### Running the Application

**Using IntelliJ IDEA:**
1. Right-click on `Main.java`
2. Select **Run 'Main'**

**Using Command Line:**
```bash
cd Hospital_Manager
java -cp out Main
```

## 📖 Usage

Upon launching the application, you'll see a menu with the following options:

```
1. Show All Patients       - Display complete patient list
2. Show All Doctors        - Display all registered doctors
3. Show All Blocks         - Display hospital departments/blocks
4. Show History            - View system operation history
5. Search Patient          - Search for a specific patient
6. Add Patient             - Register new patient
7. Add Doctor              - Register new doctor
8. Add Block               - Create new hospital block
9. Remove Patient          - Remove patient from system
10. Remove Doctor          - Remove doctor from system
0. Exit                    - Close application
```

### Example Workflow

1. **Start by adding a hospital block (department)**
   - Option 8 → Enter block details

2. **Register doctors**
   - Option 7 → Assign doctors to blocks

3. **Add patients to the queue**
   - Option 6 → Register patients

4. **Search and manage patients**
   - Option 5 → Find specific patients
   - Option 9 → Remove patients if needed

5. **Monitor system history**
   - Option 4 → View all logged operations

## 🎯 Key Design Patterns

### Model-View-Controller (MVC)
- **Separation of Concerns**: Data logic, presentation, and user interaction are cleanly separated
- **Scalability**: Easy to add new features without modifying existing code
- **Maintainability**: Changes to UI don't affect business logic

### Observer Pattern
- **Real-time Updates**: Controllers notify observers of changes
- **Loose Coupling**: Views react to model changes without direct dependencies
- **Automatic History**: History automatically updated on relevant operations

### Queue Data Structure
- **FIFO Management**: Patients are processed in first-in-first-out order
- **Efficient Operations**: O(1) enqueue and dequeue operations

## 📝 Notes

- The application uses a console-based interface (CLI)
- All data is stored in memory during runtime (not persistent)
- Observer pattern ensures history is automatically updated when patients are added/modified
- Patient queue ensures fair FIFO processing

## 🔮 Future Enhancements

- Persistent database storage (SQL/NoSQL)
- GUI implementation using JavaFX or Swing
- Advanced search and filtering capabilities
- Reporting and analytics features
- Network connectivity for multi-user access
- Role-based access control (Admin, Doctor, Receptionist)

## 📄 License

This project is provided as-is for educational purposes.

## 👨‍💻 Author

Hospital Manager - A Java-based Hospital Management System

---

**Created**: December 2025  
**Last Updated**: January 2026
**Published**: June 2026
**Status**: Completed

---

### Support & Contribution

For issues, suggestions, or contributions, feel free to open an issue or submit a pull request.

If you find this project useful, please consider giving it a ⭐!
