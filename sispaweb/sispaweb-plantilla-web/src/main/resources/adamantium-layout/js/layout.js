// FNC for detecting for click outside of any elements ============== 
$.fn.clickOff = function(callback, selfDestroy) {
	var clicked = false;
	var parent = this;
	var destroy = selfDestroy || true;

	parent.click(function() {
		clicked = true;
	});

	$(document).click(function(event) {
		if (!clicked) {
			callback(parent, event);
		}
		if (destroy) {
		}
		;
		clicked = false;
	});
};

/**
 * PrimeFaces Adamantium Layout
 */
var Adamantium = {

	init : function() {
		this.menuWrapper = $('#layout-menu-cover');
		this.menu = this.menuWrapper.find('ul.layout-menu');
		this.menulinks = this.menu.find('a.menulink');
		this.menuButton = $('#menu-button');
		this.topMenu = $('#top-menu');
		this.topMenuButton = $('#topmenu-button');
		this.expandedMenuitems = this.expandedMenuitems || [];

		this.bindEvents();
	},

	bindEvents : function() {
		var $this = this;

		this.menuButton.on('click', function() {
			$this.menuButtonClick = true;

			if ($this.menuWrapper.hasClass('active-menu')) {
				$this.menuButton.removeClass('active-menu');
				$this.menuWrapper.removeClass('active-menu');
			} else {
				$this.menuButton.addClass('active-menu');
				$this.menuWrapper.addClass('active-menu');
			}
		});

		this.menulinks
				.on(
						'click',
						function(e) {
							var menuitemLink = $(this), menuitem = menuitemLink
									.parent();

							if (menuitem.hasClass('active-menu-parent')) {
								menuitem.removeClass('active-menu-parent');
								menuitemLink.removeClass('active-menu').next(
										'ul').removeClass('active-menu');
								menuitemLink.children('i.icon-subtract')
										.removeClass('icon-subtract').addClass(
												'icon-add');
								$this.removeMenuitem(menuitem.attr('id'));
							} else {
								var activeSibling = menuitem
										.siblings('.active-menu-parent');
								if (activeSibling.length) {
									activeSibling
											.removeClass('active-menu-parent');
									$this.removeMenuitem(activeSibling
											.attr('id'));

									activeSibling.find(
											'ul.active-menu,a.active-menu')
											.removeClass('active-menu');
									activeSibling.find(
											'ul.active-menu,a.active-menu')
											.children('i.icon-subtract')
											.removeClass('icon-subtract')
											.addClass('icon-add');
									activeSibling
											.find('li.active-menu-parent')
											.each(
													function() {
														var menuitem = $(this);
														menuitem
																.removeClass('active-menu-parent');
														$this
																.removeMenuitem(menuitem
																		.attr('id'));
													});
								}

								menuitem.addClass('active-menu-parent');
								menuitemLink.addClass('active-menu').next('ul')
										.addClass('active-menu');
								menuitemLink.children('i.icon-add')
										.removeClass('icon-add').addClass(
												'icon-subtract');
								$this.addMenuitem(menuitem.attr('id'));
							}

							if (menuitemLink.next().is('ul')) {
								e.preventDefault();
							} else {
								$this.menuButton.removeClass('active-menu');
								$this.menuWrapper.removeClass('active-menu');
							}

							$this.saveMenuState();

							if ($this.perfectScrollbar) {
								$this.menuWrapper.perfectScrollbar("update");
							}
						}).clickOff(function(e) {
					if ($this.menuButtonClick) {
						$this.menuButtonClick = false;
					} else {
						$this.menuButton.removeClass('active-menu');
						$this.menuWrapper.removeClass('active-menu');
					}
				});

		this.topMenuButton.on('click', function() {
			$this.topMenuButtonClick = true;

			if ($this.topMenu.hasClass('active-menu')) {
				$this.topMenuButton.removeClass('active-menu');
				$this.topMenu.removeClass('active-menu');
			} else {
				$this.topMenuButton.addClass('active-menu');
				$this.topMenu.addClass('active-menu');
			}
		});

		// topbar
		this.topMenu.find('a').click(
				function(e) {
					var link = $(this), submenu = link.next('ul');

					if (submenu.length) {
						if (submenu.hasClass('active-menu')) {
							submenu.removeClass('active-menu');
							link.removeClass('active-menu');
							$this.topMenuActive = false;
						} else {
							$this.topMenu.find('> li > ul.active-menu')
									.removeClass('active-menu').prev('a')
									.removeClass('active-menu');

							$this.topMenu.find('> li > ul.active-menu').prev(
									'a').children('i.icon-subtract').removeClass(
									'icon-subtract').addClass('icon-add');

							link.addClass('active-menu').next('ul').addClass(
									'active-menu');
							$this.topMenuActive = true;
						}
					} else {
						if ($(e.target).is(':not(:input)')) {
							$this.topMenu.find('.active-menu').removeClass(
									'active-menu');
							$this.topMenuActive = false;
						}
					}
				}).on(
				'mouseenter',
				function() {
					var link = $(this);

					if (link.parent().parent().is($this.topMenu)
							&& $this.topMenuActive
							&& document.documentElement.clientWidth > 960) {
						var submenu = link.next('ul');

						$this.topMenu.find('.active-menu').removeClass(
								'active-menu');
						link.addClass('active-menu');

						if (submenu.length) {
							submenu.addClass('active-menu');
						}
					}
				});

		this.topMenu.find('li').clickOff(function() {
			if ($this.topMenuButtonClick) {
				$this.topMenuButtonClick = false;
			} else {
				$this.topMenuButton.removeClass('active-menu');
				$this.topMenu.removeClass('active-menu');
				$this.topMenu.find('.active-menu').removeClass('active-menu');
				$this.topMenuActive = false;
			}
		});

		if (!this.isMobile()) {
			if (this.menuWrapper.hasClass('layout-menu-cover-left')) {
				this.perfectScrollbar = this.menuWrapper.perfectScrollbar({
					suppressScrollX : true
				});
			} else {
				var win = $(window);
				if (win.width() <= 960 || win.height() <= 560) {
					this.perfectScrollbar = this.menuWrapper.perfectScrollbar({
						suppressScrollX : true
					});
				}

				win.on('resize', function() {
					if (win.width() <= 960 || win.height() <= 560) {
						if (!$this.perfectScrollbar) {
							$this.perfectScrollbar = $this.menuWrapper
									.perfectScrollbar({
										suppressScrollX : true
									});
						}
					} else {
						if ($this.perfectScrollbar) {
							$this.perfectScrollbar.perfectScrollbar('destroy');
							$this.perfectScrollbar = null;
						}
					}
				});
			}
		} else {
			this.menuWrapper.removeClass('Animated05');

			if (this.menuWrapper.hasClass('layout-menu-cover-left')) {
				this.menuWrapper.css('overflow-y', 'auto');
			} else {
				var win = $(window);
				if (win.width() <= 960 || win.height() <= 560) {
					this.menuWrapper.css('overflow-y', 'auto');
				}

				win.on('resize', function() {
					if (win.width() <= 960 || win.height() <= 560) {
						$this.menuWrapper.css('overflow-y', 'auto');
					} else {
						$this.menuWrapper.css('overflow-y', 'visible');
					}
				});
			}
		}
	},

	removeMenuitem : function(id) {
		this.expandedMenuitems = $.grep(this.expandedMenuitems,
				function(value) {
					return value !== id;
				});
	},

	addMenuitem : function(id) {
		if ($.inArray(id, this.expandedMenuitems) === -1) {
			this.expandedMenuitems.push(id);
		}
	},

	saveMenuState : function() {
		$.cookie('adamantium_expandeditems', this.expandedMenuitems.join(','),
				{
					path : '/'
				});
	},

	clearMenuState : function() {
		$.removeCookie('adamantium_expandeditems', {
			path : '/'
		});
	},

	restoreMenuState : function() {
		var menucookie = $.cookie('adamantium_expandeditems');
		if (menucookie) {
			this.expandedMenuitems = menucookie.split(',');
			for (var i = 0; i < this.expandedMenuitems.length; i++) {
				var id = this.expandedMenuitems[i];
				if (id) {
					var menuitem = $("#"
							+ this.expandedMenuitems[i].replace(/:/g, "\\:"));
					menuitem.addClass('active-menu-parent');
					menuitem.children('a,ul').addClass('active-menu');
				}
			}
		}
	},

	isMobile : function() {
		return (/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i
				.test(window.navigator.userAgent));
	},

	changeMenuLayout : function(orientation) {
		var $this = this;
		if (orientation === 'top') {
			this.menuWrapper.addClass('layout-menu-cover-top').removeClass(
					'layout-menu-cover-left');
		} else if (orientation === 'left') {
			this.menuWrapper.removeClass('Animated05 layout-menu-cover-top')
					.addClass('layout-menu-cover-left');
			if (!$this.isMobile()) {
				setTimeout(function() {
					$this.menuWrapper.addClass('Animated05');
				}, 100);

				this.perfectScrollbar = this.menuWrapper.perfectScrollbar({
					suppressScrollX : true
				});
			}
		}
	}
};

$(function() {
	Adamantium.init();

	PrimeFaces.locales['es'] = {
		closeText : 'Cerrar',
		prevText : 'Anterior',
		nextText : 'Siguiente',
		monthNames : [ 'Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio',
				'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre',
				'Diciembre' ],
		monthNamesShort : [ 'Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul',
				'Ago', 'Sep', 'Oct', 'Nov', 'Dic' ],
		dayNames : [ 'Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves',
				'Viernes', 'Sábado' ],
		dayNamesShort : [ 'Dom', 'Lun', 'Mar', 'Mie', 'Jue', 'Vie', 'Sab' ],
		dayNamesMin : [ 'D', 'L', 'M', 'M', 'J', 'V', 'S' ],
		weekHeader : 'Semana',
		firstDay : 1,
		isRTL : false,
		showMonthAfterYear : false,
		yearSuffix : '',
		timeOnlyTitle : 'Sólo hora',
		timeText : 'Tiempo',
		hourText : 'Hora',
		minuteText : 'Minuto',
		secondText : 'Segundo',
		currentText : 'Fecha actual',
		ampm : false,
		month : 'Mes',
		week : 'Semana',
		day : 'Día',
		allDayText : 'Todo el día'
	};

});