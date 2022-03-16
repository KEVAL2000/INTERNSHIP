function data() {
    function getThemeFromLocalStorage() {
        // if user already changed the theme, use it
        if (window.localStorage.getItem('dark')) {
            return JSON.parse(window.localStorage.getItem('dark'))
        }

        // else return their preferences
        return (!!window.matchMedia &&
            window.matchMedia('(prefers-color-scheme: dark)').matches
        )
    }

    function setThemeToLocalStorage(value) {
        window.localStorage.setItem('dark', value)
    }

    return {
        dark: getThemeFromLocalStorage(),
        toggleTheme() {
            this.dark = !this.dark
            setThemeToLocalStorage(this.dark)
        },
        isSideMenuOpen: false,
        toggleSideMenu() {
            this.isSideMenuOpen = !this.isSideMenuOpen
        },
        closeSideMenu() {
            this.isSideMenuOpen = false
        },
        isNotificationsMenuOpen: false,
        toggleNotificationsMenu() {
            this.isNotificationsMenuOpen = !this.isNotificationsMenuOpen
        },
        closeNotificationsMenu() {
            this.isNotificationsMenuOpen = false
        },
        isProfileMenuOpen: false,
        toggleProfileMenu() {
            this.isProfileMenuOpen = !this.isProfileMenuOpen
        },
        closeProfileMenu() {
            this.isProfileMenuOpen = false
        },
        isPagesMenuOpen: false,
        togglePagesMenu() {
            this.isPagesMenuOpen = !this.isPagesMenuOpen
        },
        // Create and Update Modal
        isModalOpen: false,
        trapCleanup: null,
        openCustomerModal() {
            this.isModalOpen = true
            this.trapCleanup = focusTrap(document.querySelector('#customerModal'))
        },
        closeCustomerModal() {
            this.isModalOpen = false
            this.trapCleanup()
        },
        // Delete Modal
        isDeleteModalOpen: false,
        trapCleanup: null,
        openDeleteModal() {
            this.isDeleteModalOpen = true
            this.trapCleanup = focusTrap(document.querySelector('#deleteCustomerModal'))
        },
        closeDeleteModal() {
            this.isDeleteModalOpen = false
            this.trapCleanup()
        },
        // Error Modal
        isErrorModalOpen: false,
        trapCleanup: null,
        openErrorModal() {
            this.isErrorModalOpen = true
            this.trapCleanup = focusTrap(document.querySelector('#errorModal'))
        },
        closeErrorModal() {
            this.isErrorModalOpen = false
            this.trapCleanup()
        }
    }
}