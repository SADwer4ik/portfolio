/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    './pages/**/*.{js,ts,jsx,tsx,mdx}',
    './components/**/*.{js,ts,jsx,tsx,mdx}',
    './app/**/*.{js,ts,jsx,tsx,mdx}',
  ],
  theme: {
    extend: {
      colors: {
        "lime": "#84cc16",
        "green":"#84EA72",
        "black":"#0000001a",
        'blue': '#1fb6ff',
        'blackSecond':"#000000b3",
        "whiteSide":"#ffffff33",
        "black3":"#3b363669",
      },
      boxShadow:{
        "xl": "0 0 50px 10px #0000001a",
        "2xl": "0 0 5px 3px rgba(255, 255, 255, 0.5)",
        "3xl": "0 0 20px 25px rgba(255, 255, 255, 0.3)",
        "4xl": "0 0 20px 25px rgba(0, 0, 0, 0.3)",
      }
    },
  },
  plugins: [],
}
