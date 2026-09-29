<div align="center">

# 🏢 HRMS — Human Resource Management System

**A Java Swing desktop application for managing employees, payroll, and reports — built as a university Java project.**

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Java Swing](https://img.shields.io/badge/Java_Swing-007396?style=for-the-badge)](https://docs.oracle.com/javase/tutorial/uiswing/)
[![SQLite](https://img.shields.io/badge/SQLite-003B57?style=for-the-badge&logo=sqlite&logoColor=white)](https://www.sqlite.org/)
[![iTextPDF](https://img.shields.io/badge/iTextPDF-FF0000?style=for-the-badge)](https://itextpdf.com/)
[![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apachenetbeans&logoColor=white)](https://netbeans.apache.org/)

</div>

---

## 📸 Preview

![HRMS preview](assets/hero.webp)

## 📖 About

This is a complete **Human Resource Management System** written in Java, built with the NetBeans GUI designer (Matisse). It runs as a standalone desktop app: you log in, and from the main menu you can manage employee records, adjust salaries, apply allowances and deductions, search employees, generate PDF payslips, and review an audit trail of activity. All data is stored in a local SQLite database — no server needed.

I built this to learn how a real desktop application fits together: forms, event handling, database access, and report generation, all in one project.

## 🧩 What's Inside

Every screen is a separate form in the `humanresourcesystemm` package under `HRMS/src/`:

| Form | What it does |
|---|---|
| `login.java` | Login screen — validates credentials against the database |
| `MainMenu.java` | Dashboard with navigation to every module |
| `addEmployee.java` | Form for adding a new employee record |
| `updatesalary.java` | Update an employee's base salary |
| `Allowance.java` | Add allowances (bonuses, medical, etc.) to a profile |
| `deductions.java` | Apply deductions (tax, unpaid leave, etc.) |
| `searchempsalary.java` | Search employees and generate PDF payslip reports |
| `Audit.java` | Activity / audit-trail log viewer |
| `Emp.java` | Employee record management form |
| `About.java` | About screen |
| `db.java` | SQLite connection helper (`db_java()`) |
| `HumanResourceSystem.java` | Entry-point class |

The database file `HRMS/HRMS.db` is included in the repo, so the app has data to work with right away.

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java (SE) |
| GUI | Java Swing / AWT (NetBeans Matisse forms) |
| Database | SQLite via `sqlite-jdbc-3.42.0.0.jar` |
| PDF reports | iText `itextpdf-5.5.4.jar` |
| Table binding | `rs2xml.jar` (ResultSet → JTable) |
| Date pickers | `jdatepicker-1.3.4.jar` |
| Build / IDE | Apache NetBeans (Ant `build.xml`) |

All required `.jar` files ship in the `HRMS/` folder.

## 🚀 Build & Run

### Option 1 — NetBeans (easiest)

1. Clone the repo: `git clone https://github.com/hussnainahmedd/JAVA-Project.git`
2. In NetBeans: **File → Open Project** and select the `HRMS` folder.
3. Make sure the `.jar` files in `HRMS/` are on the project's classpath (Libraries).
4. Right-click `login.java` (or `MainMenu.java`) → **Run File**.

### Option 2 — Command line

From inside the `HRMS/` folder:

```bash
javac -cp ".;sqlite-jdbc-3.42.0.0.jar;itextpdf-5.5.4.jar;rs2xml.jar;jdatepicker-1.3.4.jar" src/Humanresourcesystemm/*.java
java -cp ".;src;sqlite-jdbc-3.42.0.0.jar;itextpdf-5.5.4.jar;rs2xml.jar;jdatepicker-1.3.4.jar" humanresourcesystemm.login
```

(On Linux/macOS, replace `;` with `:` in the classpath.)

> ⚠️ One honest note: the connection string in `db.java` uses a hardcoded Windows path (`jdbc:sqlite:C:/Users/.../HRMS/HRMS.db`). If the app can't connect on your machine, update that path in `db.java` to point at the `HRMS.db` file in your clone.

## 📂 Project Structure

```
JAVA-Project/
├── README.md
└── HRMS/                          # NetBeans project
    ├── build.xml                  # Ant build script
    ├── HRMS.db                    # SQLite database (ships with the repo)
    ├── sqlite-jdbc-3.42.0.0.jar    # SQLite JDBC driver
    ├── itextpdf-5.5.4.jar         # PDF generation
    ├── rs2xml.jar                 # ResultSet → JTable binding
    ├── jdatepicker-1.3.4.jar      # Date picker component
    └── src/Humanresourcesystemm/  # Source: 12 forms + db helper + entry point
```

---

<div align="center">

Built by **Hussnain Ahmad** — learning by building, one project at a time.
<br>
https://github.com/hussnainahmedd

</div>
