# Contributing to Hospital Manager

Thank you for your interest in contributing to the Hospital Manager project! This document provides guidelines and instructions for contributing.

## Code of Conduct

- Be respectful and inclusive
- Welcome people from all backgrounds
- Provide constructive feedback
- Focus on the work, not the person

## How to Contribute

### Reporting Bugs

Before creating bug reports, please check the issue list as you might find out that you don't need to create one.

When creating a bug report, include:
- **Clear title and description**
- **Steps to reproduce** the problem
- **Expected behavior** vs actual behavior
- **Screenshots or error logs** if applicable
- **Environment details** (OS, Java version, IDE)

### Suggesting Enhancements

Enhancement suggestions are welcome! When suggesting an enhancement:
- Use a clear title
- Provide a detailed description of the suggested enhancement
- Explain the expected benefits
- List similar features in other projects (if applicable)

### Pull Requests

1. **Fork** the repository
2. **Create a feature branch** (`git checkout -b feature/YourFeature`)
3. **Make your changes** following the code style guidelines
4. **Commit your changes** with clear commit messages
5. **Push to your branch** (`git push origin feature/YourFeature`)
6. **Open a Pull Request** with a clear description

### Code Style Guidelines

#### Java Code Style
```java
// Use meaningful variable names
public class PatientController {
    // Use 4-space indentation
    public void addPatient(Patient patient) {
        if (patient != null) {
            // Clear, readable logic
            model.addPatient(patient);
            notifyObservers();
        }
    }
}
```

- Use **CamelCase** for class names (PascalCase)
- Use **camelCase** for method and variable names
- Use **UPPER_SNAKE_CASE** for constants
- Maximum line length: 100 characters
- Add meaningful comments for complex logic
- Keep methods focused and single-responsibility

## Project Architecture

When adding new features, follow the existing architecture:

```
Controller Layer  ←→  Model Layer  ←→  View Layer
     ↓
  Observer Pattern → History Tracking
```

### Adding a New Feature

1. **Add Data Structure** in `src/DataStructs/` if needed
2. **Update Model** in `src/Model/GlobalModel.java`
3. **Create Controller** in `src/Controller/` if needed
4. **Implement View** in `src/View/` for user interaction
5. **Update Main.java** to integrate new feature
6. **Add tests** and documentation

## Testing

- Test your changes thoroughly before submitting a PR
- Verify all existing functionality still works
- Test edge cases and error scenarios
- Provide clear test cases in the PR description

## Documentation

- Update README.md if your feature requires new instructions
- Add inline comments for complex logic
- Document public methods with purpose and parameters
- Keep documentation updated with code changes

## Development Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/TouMouHou/Hospital_Manager.git
   cd Hospital_Manager
   ```

2. **Open in IntelliJ IDEA**
   - File → Open → Select project folder
   - Let IDE configure the Java project

3. **Build the project**
   - Build → Build Project

4. **Run the application**
   - Right-click Main.java → Run 'Main'

## Branch Naming Convention

- `feature/feature-name` - New features
- `bug/bug-description` - Bug fixes
- `refactor/description` - Code refactoring
- `docs/description` - Documentation updates

## Pull Request Process

1. Update documentation with any changes
2. Ensure code follows style guidelines
3. Provide clear PR title and description
4. Link any related issues
5. Ensure your branch is up-to-date with main
6. Wait for review and address feedback

## Questions?

- Check existing issues and discussions
- Ask questions in issue comments
- Review project documentation

---

Thank you for contributing to Hospital Manager! 🎉
