function showEnroll() {
    fetch("http://localhost:8080/course/enroll")
        .then(response => response.json())
        .then(courses => {
            const dataTable = document.getElementById("enrolltable"); // corrected id

            courses.forEach(course => {
                const row = `
                    <tr>
                        <td>${course.name}</td>
                        <td>${course.emailId}</td>
                        <td>${course.courseName}</td> <!-- Match your field name -->
                    </tr>
                `;
                dataTable.innerHTML += row;
            });
        })
        .catch(error => {
            console.error("Error fetching courses:", error);
        });
}
