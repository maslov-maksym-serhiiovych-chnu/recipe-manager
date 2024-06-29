/** @type {import('tailwindcss').Config} */
module.exports = {
    content: ['src/main/resources/templates/**/*.html'],
    theme: {
        extend: {
            fontFamily: {
                sans: ['Roboto', 'sans-serif'],
            }
        },
    },
    plugins: [],
}
