# Quick Start Guide

Get the Hospital Manager application running in 5 minutes!

## Prerequisites

- Java Development Kit (JDK) 8+
- Terminal/Command Prompt

## Option 1: Run with IntelliJ IDEA (Fastest)

1. **Open Project**
   - Launch IntelliJ IDEA
   - `File` → `Open` → Select `Hospital_Manager` folder

2. **Build**
   - `Build` → `Build Project` (Ctrl+F9)

3. **Run**
   - Right-click `Main.java`
   - Select `Run 'Main'`

Done! The application will start in the console below.

---

## Option 2: Run from Command Line

### Windows
```batch
cd Hospital_Manager
javac -d out src/**/*.java
java -cp out Main
```

### macOS/Linux
```bash
cd Hospital_Manager
javac -d out src/**/*.java
java -cp out Main
```

---

## First Steps

Once the application starts, you'll see a menu. Here's a suggested workflow:

### Step 1: Add a Hospital Block (Department)
```
> 8
> Enter block details when prompted
> This creates a department (e.g., Cardiology, Surgery)
```

### Step 2: Add Doctors
```
> 7
> Register a doctor and assign to a block
> Repeat for multiple doctors
```

### Step 3: Add Patients
```
> 6
> Register patient details
> Patients are added to a queue
> Add a few patients
```

### Step 4: Search Patients
```
> 5
> Try searching by ID or name
> See patient details
```

### Step 5: View History
```
> 4
> See all operations logged by the system
> History automatically tracks all changes
```

### Step 6: Explore Other Options
```
> 1: View all patients
> 2: View all doctors
> 3: View all blocks
> 9: Remove a patient
> 10: Remove a doctor
```

---

## Menu Reference

| Option | Function |
|--------|----------|
| 1 | Show all patients |
| 2 | Show all doctors |
| 3 | Show all blocks/departments |
| 4 | Show operation history |
| 5 | Search for a patient |
| 6 | Add new patient |
| 7 | Add new doctor |
| 8 | Add new hospital block |
| 9 | Remove a patient |
| 10 | Remove a doctor |
| 0 | Exit application |

---

## Troubleshooting

### Error: "Cannot find symbol"
- **Cause**: Java files not compiled
- **Fix**: Run `javac -d out src/**/*.java` from Hospital_Manager folder

### Error: "Main class not found"
- **Cause**: Wrong working directory
- **Fix**: Make sure you're in the `Hospital_Manager` folder before running

### IntelliJ shows red squiggles
- **Cause**: Project not marked as Java project
- **Fix**: Right-click project folder → `Mark Directory as` → `Sources Root`

### Application exits immediately
- **Cause**: Run through IDE is best, command line may need adjustment
- **Fix**: Use IntelliJ IDEA's Run button

---

## Next Steps

- Read the full [README.md](README.md) for detailed documentation
- Check [CONTRIBUTING.md](CONTRIBUTING.md) if you want to improve the project
- Explore the source code in `src/` folder to understand the architecture

---

## Need Help?

1. Check the README.md for full documentation
2. Review the code structure in `src/`
3. Look at existing code examples for patterns

Happy coding! 🚀
