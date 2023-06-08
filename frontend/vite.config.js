import { fileURLToPath, URL } from 'node:url'
// import Pages from 'vite-plugin-pages'
import { cpa } from "./vite.plugins";

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import { resolve } from 'path'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
      vue(),
      // Pages({
      //     dirs: [
      //         { dir: resolve(__dirname, './src/views/client'), baseRoute: '' },
      //         { dir: resolve(__dirname, './src/views/console'), baseRoute: 'console' }
      //     ]
      // }),
      cpa({
          pages: {
              index: {
                  filename: 'index.html',
                  entry: '/src/index.client.js',
                  template: 'index.html',
              },
              console: {
                  filename: 'console.html',
                  entry: '/src/index.console.js',
                  template: 'console.html',
              }
          },
      })
  ],
  resolve: {
      alias: {
        '@': fileURLToPath(new URL('./src', import.meta.url))
      }
  },
  build: {
      outDir: "../backend/src/main/resources/static",
      emptyOutDir: true,
      rollupOptions: {
          input: {
              index: resolve(__dirname, 'index.html'),
              console: resolve(__dirname, 'console.html')
          }
      }
  }
})
