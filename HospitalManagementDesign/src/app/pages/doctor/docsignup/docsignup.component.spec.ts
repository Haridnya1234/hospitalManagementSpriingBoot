import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DocsignupComponent } from './docsignup.component';

describe('DocsignupComponent', () => {
  let component: DocsignupComponent;
  let fixture: ComponentFixture<DocsignupComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DocsignupComponent]
    });
    fixture = TestBed.createComponent(DocsignupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
