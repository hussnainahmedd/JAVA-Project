<div align="center">

# 🏢 Human Resource Management System (HRMS)

### _A Comprehensive Desktop Application for Employee Management_

[![Java](https://img.shields.io/badge/Java-Swing-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![SQLite](https://img.shields.io/badge/SQLite-Database-003B57?style=for-the-badge&logo=sqlite&logoColor=white)](https://www.sqlite.org/)
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans&logoColor=white)](https://netbeans.apache.org/)
[![iTextPDF](https://img.shields.io/badge/Reports-iTextPDF-FF0000?style=for-the-badge)](https://itextpdf.com/)

<br/>

```
    ╔══════════════════════════════════════════════════════╗
    ║                                                      ║
    ║        ██╗  ██╗██████╗ ███╗   ███╗███████╗           ║
    ║        ██║  ██║██╔══██╗████╗ ████║██╔════╝           ║
    ║        ███████║██████╔╝██╔████╔██║███████╗           ║
    ║        ██╔══██║██╔══██╗██║╚██╔╝██║╚════██║           ║
    ║        ██║  ██║██║  ██║██║ ╚═╝ ██║███████║           ║
    ║        ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝           ║
    ║                                                      ║
    ║       Streamline Your HR Operations Efficiently      ║
    ╚══════════════════════════════════════════════════════╝
```

<br/>

> 💼 A robust, standalone **Java-based desktop application** designed to manage all aspects of Human Resources. From tracking employee details and calculating salaries (with allowances and deductions) to generating secure PDF reports and maintaining audit logs, this system handles it all through an intuitive GUI.

---

[Features](#-features) •
[Screenshots](#-modules) •
[Tech Stack](#-tech-stack) •
[Setup](#-quick-start) •
[Project Structure](#-project-structure)

</div>

---

## ✨ Features

<table>
<tr>
<td width="50%">

### 👥 Employee Management
- **Add, Update, and Search** employee records easily.
- Store detailed personal, contact, and departmental information.
- Secure login portal with role-based access control.

### 💰 Payroll & Salary
- Comprehensive salary management system.
- Calculate and apply **Allowances** (bonuses, medical, etc.).
- Calculate and apply **Deductions** (taxes, absences, etc.).
- Update base salaries dynamically.

</td>
<td width="50%">

### 📄 Report Generation
- Instantly generate professional **PDF reports** and payslips.
- Export employee records and financial data securely using iTextPDF.

### 🛡️ Audit & Security
- Built-in **Audit Trail** to track user activity and logins.
- Secure database connectivity using SQLite.
- Interactive and user-friendly Java Swing graphical interface.

</td>
</tr>
</table>

---

## 🏗️ Modules & Forms

The application is built around several dedicated modules (accessible via the `MainMenu`):

1. **Login (`login.java`)**: Secure entry point validating user credentials against the database.
2. **Add Employee (`addEmployee.java`)**: Form for entering new staff details into the system.
3. **Salary Update (`updatesalary.java`)**: Interface to modify base pay for promotions or adjustments.
4. **Allowances (`Allowance.java`)**: Calculate and add extra compensation to an employee's profile.
5. **Deductions (`deductions.java`)**: Calculate and deduct taxes, penalties, or unpaid leave.
6. **Search & Payslips (`searchempsalary.java`)**: Locate employees and generate PDF payslip reports.
7. **Audit Logs (`Audit.java`)**: Track system usage and administrative actions.

---

## 🛠️ Tech Stack

<div align="center">

| Layer | Technology / Library | Purpose |
|:---|:---|:---|
| **Core Language** | Java SE | Application logic |
| **GUI Framework** | Java Swing & AWT | Desktop graphical user interface |
| **Database** | SQLite (`sqlite-jdbc`) | Lightweight, serverless relational data storage |
| **PDF Generation** | `itextpdf-5.5.4.jar` | Exporting payslips and employee reports |
| **UI Components** | `rs2xml.jar`, `jdatepicker` | Advanced table rendering and date selection |
| **IDE Environment** | Apache NetBeans | Project structuring and form generation |

</div>

---

## 🚀 Quick Start

### Prerequisites

| Requirement | Why |
|:---|:---|
| **Java Development Kit (JDK 8+)** | To compile and run the Java code |
| **Apache NetBeans (Recommended)** | For easy opening of the project and GUI designer editing |

### Installation

**1. Clone the repository**
```bash
git clone https://github.com/hussnainahmedd/JAVA-Project.git
```

**2. Open in NetBeans**
- Launch NetBeans IDE.
- Go to `File` > `Open Project...`
- Navigate to the cloned repository and select either the `HRMS` or `HRMS M` folder.

**3. Verify Libraries**
Ensure the following `.jar` files (included in the root of the project folders) are added to your project's Build Path/Libraries:
- `sqlite-jdbc-3.42.0.0.jar`
- `itextpdf-5.5.4.jar`
- `rs2xml.jar`
- `jdatepicker-1.3.4.jar`

**4. Run the Application**
- Right-click the `login.java` or `HumanResourceSystem.java` file and select **Run File**.

> [!IMPORTANT]
> The database file (`HRMS.db`) is already included in the repository. Make sure the database connection string in `db.java` correctly points to the location of this file if you move the project directory.

---

## 📂 Project Structure

```
JAVA-Project/
│
├── HRMS/                           # Main Project Directory
│   ├── build.xml                   # Ant build script
│   ├── HRMS.db                     # 🗄️ SQLite Database File
│   ├── manifest.mf                 # JAR Manifest
│   ├── nbproject/                  # NetBeans configuration files
│   ├── *.jar                       # Required libraries (SQLite, iTextPDF, etc.)
│   │
│   └── src/Humanresourcesystemm/   # 💻 Source Code
│       ├── db.java                 # Database connection logic
│       ├── login.java              # Auth screen
│       ├── MainMenu.java           # Dashboard
│       ├── addEmployee.java        # Employee entry form
│       ├── Allowance.java          # Compensation logic
│       ├── deductions.java         # Penalty logic
│       ├── Audit.java              # Activity tracking
│       ├── searchempsalary.java    # Reporting interface
│       └── images/                 # UI Icons and Assets
│
└── HRMS M/                         # Secondary/Modified Project Directory (similar structure)
```

---

## 🤝 Contributing

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/amazing-feature`)
3. **Commit** your changes (`git commit -m '✨ Add amazing feature'`)
4. **Push** to the branch (`git push origin feature/amazing-feature`)
5. **Open** a Pull Request

---

<div align="center">

**⭐ Star this repo if you found it useful!**

<br/>

Built with ☕ Java and Swing.

</div>
